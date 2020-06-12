package in.btes.BtesFeedbackPortals.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.btes.BtesFeedbackPortals.entities.User;
import in.btes.BtesFeedbackPortals.entities.adminEntity;
import in.btes.BtesFeedbackPortals.repositories.adminRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@Controller
@RequestMapping(path="/demo")
public class adminController {
   @Autowired
   private adminRepository AdminRepository;
   @GetMapping(path="/alldata")
   public @ResponseBody Iterable<adminEntity> getAllQuestions() {
     return AdminRepository.findAll();
   }
  @DeleteMapping(path="/admin/{id}")
   public String delete(@RequestParam Long id) {
	    AdminRepository.deleteById(id);
	   return "deleted";
   } 
  @PutMapping(path="/updates/{id}")
  adminEntity replaceQuestion(@RequestBody adminEntity newUser, @RequestParam Long id) {

    return AdminRepository.findById(id)
      .map(admin -> {
        admin.setId(newUser.getId());
        admin.setQuestions(newUser.getQuestions());
        return AdminRepository.save(admin);
      })
      .orElseGet(() -> {
        newUser.setId(id);
        return AdminRepository.save(newUser);
      });
  } 
   @PostMapping("/adds")
   public String addUser(@RequestBody adminEntity admin) {
       AdminRepository.save(admin);
   return "saved";
   }
}
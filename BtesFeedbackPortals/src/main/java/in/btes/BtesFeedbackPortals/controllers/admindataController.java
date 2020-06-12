package in.btes.BtesFeedbackPortals.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import in.btes.BtesFeedbackPortals.entities.admins;
import in.btes.BtesFeedbackPortals.repositories.AdmindataRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@Controller
@RequestMapping(path="/demo")
public class admindataController {
   @Autowired
   private AdmindataRepository admindataRepository;
   @GetMapping(path="/allinfo")
   public @ResponseBody Iterable<admins> getAllUsers() {
     return admindataRepository.findAll();
   }
   @GetMapping(path="/logins/{email,password}")
	 
   public ResponseEntity<Optional<admins>> getAdminByEmail(@RequestParam String email, @RequestParam String password)
   {
	   Optional<admins> admind=((AdmindataRepository) admindataRepository).findByEmail(email);
	   Optional<admins> admind1=((AdmindataRepository) admindataRepository).findByPassword(password);
	   if(admind.equals(admind1))
 	  return ResponseEntity.ok().body(admind);
	   else
		   return ResponseEntity.ok().body(null);
   }
  @DeleteMapping(path="/admins/{id}")
   public String deleteUser(@RequestParam Long id) {
	   admindataRepository.deleteById(id);
	   return "deleted";
   } 
   @PutMapping(path="/updatedata")
 public admins update(@RequestBody admins id) {   
      return admindataRepository.save(id);  
   }  
   @PostMapping("/addinfo")
   public String addUser(@RequestBody admins admininfo) {
       admindataRepository.save(admininfo);
   return "saved";
   }
}
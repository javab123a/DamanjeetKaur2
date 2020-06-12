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
import in.btes.BtesFeedbackPortals.repositories.UserRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@Controller
@RequestMapping(path="/demo")
public class UserController {
   @Autowired
   private UserRepository userRepository;
   @GetMapping(path="/all")
   public @ResponseBody Iterable<User> getAllUsers() {
     return userRepository.findAll();
   }
   @GetMapping(path="/logindata/{id,password}")
	 
   public ResponseEntity<Optional<User>> getUserById(@RequestParam String id, @RequestParam String password)
   {
	   Optional<User> user=userRepository.findById(id);
 	  Optional<User> user1=userRepository.findByPassword(password);
 	  if(user.equals(user1))
 	  return ResponseEntity.ok().body(user);
 	  else
 		  return ResponseEntity.ok().body(null);
   }
  @DeleteMapping(path="/user/{id}")
   public String deleteUser(@RequestParam String id) {
	    userRepository.deleteById(id);
	   return "deleted";
   } 
  @PutMapping(path="/update/{id}")
  User replaceStudent(@RequestBody User newUser, @RequestParam String id) {

    return userRepository.findById(id)
      .map(user -> {
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        user.setTechnology(newUser.getTechnology());
        user.setBatch(newUser.getBatch());
        return userRepository.save(user);
      })
      .orElseGet(() -> {
        newUser.setId(id);
        return userRepository.save(newUser);
      });
  }
   @PostMapping("/add")
   public String addUser(@RequestBody User user) {
       userRepository.save(user);
   return "saved";
   }
}
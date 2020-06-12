package in.btes.BtesFeedbackPortals.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import in.btes.BtesFeedbackPortals.entities.Result;
import in.btes.BtesFeedbackPortals.repositories.ResultRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@Controller
@RequestMapping(path="/demo")
public class resultController {
	@Autowired
	   private ResultRepository resultRepository;
	@GetMapping(path="/allresult")
	   public @ResponseBody Iterable<Result> getAllUsers() {
	     return resultRepository.findAll();
	   }
	@PostMapping("/addresult")
	   public String addUser(@RequestBody Result result) {
	       resultRepository.save(result);
	   return "saved";
	   }
}

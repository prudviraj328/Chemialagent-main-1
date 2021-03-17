package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Usercontroller {
	
	@Autowired
    Userservice usersev;

	
	
	@GetMapping("/")
	public String hello() {
		return "Welcome to chemicalagent";
	}
	
	@PostMapping("/save")
	public  Response saveUser(@RequestBody User user) {
		 return usersev.save(user) ;
	}

  @PostMapping("/verify")
  public  Response verifyUser(@RequestBody User user) {
	return usersev.verifyUser(user);
   }
  @PostMapping("/login")
	public  User loginUser(@RequestBody User user) {
		 return usersev.login(user) ;
	}
  
  @PostMapping("/entry")
  public  Response saveAdd(@RequestBody Add add) {
		 return usersev.save(add);
	}
  @GetMapping("/show")
  public  List<Add> findlistp() {
		 return usersev.findAllp();
	}
  @GetMapping("/show1/{sellername}")
  public  List<Add> findBySeller(@PathVariable String sellername) {
		return usersev.findBySeller(sellername);
	}


}

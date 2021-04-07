package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
  @GetMapping("/show2/{chemicalname}")
  public  List<Add> findByChemicalname(@PathVariable String chemicalname) {
		return usersev.findByChemicalname(chemicalname);
	}
  @GetMapping("/show3/{username}")
  public  User findByUsername(@PathVariable String username) {
//	  System.out.println(username);
		return usersev.findByUsername(username);
	}
  @DeleteMapping("/delete/{id}")
  public int deleteById(@PathVariable int id) {
	return usersev.deleteById(id);
	  
  }
 @PutMapping("/update/{id}")
 public int updateById(@PathVariable int id) {
	return usersev.updateById(id);
	 
 }

}

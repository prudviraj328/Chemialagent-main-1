package com.example.demo;


import java.util.List;

import com.example.demo.Response;

public interface Userservice {
	
	public  Response save(User user);
	
	public  Response verifyUser(User user);
	
	public  User login(User user);
	
	public Response save(Add  add);
	
	public List<User>findAll();
	
	
	public List<Add>findAllp();
	
	public List<Add>findBySeller(String sellername);
	

}

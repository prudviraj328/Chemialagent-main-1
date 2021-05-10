package com.example.demo;


import java.util.List;

import com.example.demo.Response;

public interface Userservice {
	
	public  Response save(User user);
	
	public  Response verifyUser(User user);
	
	public  Response login(User user);
	
	public Response save1(Add  add);
	
	public List<User>findAll();
	
	
	public List<Add>findAllp();
	
	public List<Add>findBySeller(String sellername);
	
	public List<Add>findByChemicalname(String chemicalname);
	
	public User findByUsername(String username);
	
	public int deleteById(int id);
	
	public int updateById(int id);
	
	public Response forgotpasswordemail(String email);
	
	public Response verifyforgot(User user);
	
	 public Response newpassword(User user);
	 
	 public int UpdateStatusById(int id);
	
	 public Response close(User user);
}

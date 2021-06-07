package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface Userrepository extends  CrudRepository<User, Long>{
	
	 User findByEmail(String Email);
	 User findByUsernameAndPassword(String UserName, String Password);
	 User findByUsername(String username);
	}

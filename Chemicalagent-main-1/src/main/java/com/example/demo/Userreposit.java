package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Userreposit extends JpaRepository<User, Integer>{
	
	 @Query("update User u set u.otp = ?1 where u.email = ?2")
	 User setUserInfoByEmail(String otp, String email);

}

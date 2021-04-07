package com.example.demo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.example.demo.Response;

@Service
public class Userserviceimpl implements Userservice {
	
	 @Autowired
	  Userrepository userrep;
	 @Autowired
	 Addrespository addrep;
	 
	 String email;
	 
	 @Autowired
	 private JavaMailSender javaMailSender;
	
	public Response save(User user) {
		   Response response = new Response();
			email = user.getEmail();
			//String username = user.getUsername();
			//User user2 = userrep.findByUsername(username);
			User user1 = userrep.findByEmail(email);
			if(user1== null) {
				 MimeMessage mimeMessage = javaMailSender.createMimeMessage();
				 String otp = generateOTP();
				 MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
				 try {
					mimeMessageHelper.setFrom("prudvi1996@gmail.com");
					 mimeMessageHelper.setTo(email);
					 mimeMessageHelper.setSubject("OTP");
					 mimeMessageHelper.setText("the OTP is... " + otp); 
					 user.setIsverified("0");
					 user.setOtp(otp);
					 userrep.save(user);
					 javaMailSender.send(mimeMessage);
					 response.setStatus(200);
                     response.setMessage("Otp sent Sucessfully");
                     System.out.println("Otp sent Sucessfully");
					 System.out.println("done");
				} catch (MessagingException e) {
				
					e.printStackTrace();
				}	
			}else {
				 response.setStatus(201);
                 response.setMessage("User already exist");
                 System.out.println("User already exist");
			}
			if(user.getPassword().equals(user.getConfirmpassword())) {
				String Password = user.getPassword();
			}
			else {
				throw new Error("password & confirmpassword doesnot match");
			}
			return response;
	}
	public static String generateOTP()  
    {  
		Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    
	    // this will convert any number sequence into 6 character.
	    return  String.format("%06d", number);
    }
	@Override
	public Response verifyUser(User user) {
		Response response = new Response();
		  User userverify = userrep.findByEmail(user.getEmail());
		  String receviedotp = user.getOtp();
		  String otp = userverify.getOtp();
		  if(receviedotp.equals(otp) ) {
			  response.setStatus(200);
			  userverify.setIsverified("1");
			  userrep.save(userverify);
			  response.setMessage("verified");
			  System.out.println("verified");
		  }else {
			  response.setStatus(201);
			  userrep.delete(userverify);
			  response.setMessage("not verified");
			  System.out.println("not verified");
		  }
		  return response;
		  
	}
	@Override
	public User login(User user) {
		 User temp = new User();
	        temp = userrep.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//	        System.out.println(temp.getUsername());
//	        System.out.println(temp.getPassword());
//	        System.out.println(user.getUsername());
//	        System.out.println(user.getPassword());
//	        
	        if (temp.getUsername().equals(user.getUsername()) && temp.getPassword().equals(user.getPassword()) && temp.getIsverified() == "0" ) {
	        	 user.setIsverified("1");
				  userrep.save(user);
	            return temp;
	        }
	        else{
	            return temp;
	        }
	        
	        
	}
	@Override
	public Response save(Add add) {
		Response response = new Response();
		String chemicalname=add.getChemicalname();
		String quantity=add.getQuantity();
		String manufature=add.getManufacturedate();
		String expire=add.getExpirydate();
		String available=add.getAvailabilitydate();
		String qnty=add.getQntyoptions();
		double price=add.getPrice();
		String create=add.getCreatedby();
		if(chemicalname!=null && quantity!=null && manufature!=null && expire!=null && available!=null && price!=0 && create!=null && qnty!=null) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis()); 
			 String str=timestamp.toString();
			System.out.println(timestamp);
			 response.setStatus(200);
			 response.setMessage("verified");
			add.setTimestamp(str);
			addrep.save(add);
			
		}
		else {
			  response.setStatus(201);
			  response.setMessage("not verified");
			System.out.println("Invalid data");
		}
		return response;
	}
	public List<User>findAll(){
		return addrep.findAll();
	}
	@Override
	public List<Add> findAllp() {
		return addrep.findAllp();
	}
	@Override
	public List<Add> findBySeller(String sellername) {
		return addrep.findBySeller(sellername);
	}
	@Override
	public List<Add> findByChemicalname(String chemicalname) {
		
		return addrep.findByChemicalname(chemicalname);
	}
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userrep.findByUsername(username);
	}
	@Override
	public int deleteById(int id) {
		
		return addrep.deleteById(id);
	}
	@Override
	public int updateById(int id) {
	
		return addrep.UpdateById(id);
	}
}

package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class Addrespository {
	
	@Autowired
	 JdbcTemplate jdbc;
	public int save(Add p){    
	        String sql="insert into userinfo.add(chemicalname,quantity,availabilitydate,manufacturedate,expirydate,price,createdby,timestamp,sellername,qntyoptions,userid,companyname)values("+"\""+p.getChemicalname()+"\""+","+"\""+p.getQuantity()+"\""+","+"\""+p.getAvailabilitydate()+"\""+","+"\""+p.getManufacturedate()+"\""+","+"\""+p.getExpirydate()+"\""+","+"\""+p.getPrice()+"\""+","+"\""+p.getCreatedby()+"\""+","+"\""+p.getTimestamp()+"\""+","+"\""+p.getSellername()+"\""+","+"\""+p.getQntyoptions()+"\""+","+"\""+p.getUserid()+"\""+","+"\""+p.getCompanyname()+"\""+")";
	        return jdbc.update(sql);    
	    } 
	
	public List<User> findAll(){    
        return jdbc.query("select * from buyercr ",new RowMapper<User >(){    
            public User mapRow(ResultSet rs, int row) throws SQLException {    
            	User  e=new User();  
            	e.setFullname(rs.getString(1));
                e.setEmail(rs.getString(2));
                e.setPhonenumber(rs.getString(3));  
                e.setOtp(rs.getString(4));    
                e.setUsername(rs.getString(5));
                e.setPassword(rs.getString(6)); 
                e.setConfirmpassword(rs.getString(7));   
                e.setCity(rs.getString(8));
                e.setAddress(rs.getString(9));   
                
                return e;    
            }    	   	
    });
	
	}
	public List<Add> findAllp(){    
        return jdbc.query("select * from userinfo.add ",new RowMapper<Add >(){    
            public Add mapRow(ResultSet rs, int row) throws SQLException {    
            	Add  a=new Add();  
            	a.setChemicalname(rs.getString(1));
				a.setQuantity(rs.getString(2));
				a.setQntyoptions(rs.getString(10));
				a.setManufacturedate(rs.getString(3));
				a.setExpirydate(rs.getString(4));
				a.setSellername(rs.getString(8));
				a.setTimestamp(rs.getString(9));
				return a;
                   
            }    	   	
    });
	
	}
	public List<Add> findBySeller(String sellername){    
        return jdbc.query("select * from userinfo.add where sellername='"+sellername+"'",new RowMapper<Add >(){    
            public Add mapRow(ResultSet rs, int row) throws SQLException {    
            	Add  a=new Add();  
            	a.setChemicalname(rs.getString(1));
				a.setQuantity(rs.getString(2));
				a.setQntyoptions(rs.getString(10));
				a.setManufacturedate(rs.getString(3));
				a.setExpirydate(rs.getString(4));
				a.setSellername(rs.getString(8));
				a.setTimestamp(rs.getString(9));
				return a;
                   
            }    	   	
    });
	
	}
	
}
package com.nit.dboperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DbOperation {
	 
	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	/*public void  addDetails() {
		
	jdbcTemplate.update("insert into user_register values(105,'rahul','rahul@gmail.com')");
		
		System.out.println("user details update successfully");
	}

	 //load all the details in console
	
	public void loadAlluser() {
		
		String query="select * from user_register";
		
		   List<Users> allUsers=jdbcTemplate.query(query, new BeanPropertyRowMapper<Users>(Users.class));
		   
		  System.out.println(allUsers);  
	}
		 
		   public void getIds() {
			   
			   List<Integer> allIds=jdbcTemplate.queryForList("select id from user_register",Integer.class);
			   System.out.println(allIds);
		   }
		   */
		   //delete user by id
		    public void deleteUser(int id) {
		    	
		    	String query="delete from user_register where id="+id;
		    	System.out.println(query);
		    	int count=jdbcTemplate.update(query);
		    	System.out.println("no of record deleted:"+count);
		    	
		    }
	}
	 


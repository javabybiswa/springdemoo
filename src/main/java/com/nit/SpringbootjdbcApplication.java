package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.dboperation.DbOperation;

@SpringBootApplication
public class SpringbootjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootjdbcApplication.class, args);
		
		 
		    DbOperation ops= context.getBean(DbOperation.class);
		    
		 //   ops.addDetails();
		    
		   // ops.loadAlluser();
		    
		    //ops.getIds();
		    
		   ops.deleteUser(105);
		    
		    
		
		
	}

}

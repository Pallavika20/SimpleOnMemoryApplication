package com.company.Controller;

import com.company.Example;
import com.company.Services.Services;

public class UserController {
	public void handleUser() {
		Services services = new Services();
		while(true) {
		    	  System.out.println("Enter your choice" + "\n" 
				  			+ "1.Login" +"\n" + "2.Signup" + "\n" +"3.logout");	
			      int processChoice = Example.getValue();
		    	  switch(processChoice) {
		    	  case 1 :{
		    		  services.login();
		    		  break;
		    	  }
		    	  case 2:{
		    		  services.signup();
		    		  break;
		    	  }
		    	  case 3:{
		    		  System.out.println("Thank you for using our web application...");
		    		  break;
		    	  }
		    	  default:
		    		  System.out.println("Enter the correct choice");
		    	  
		    	  }
		
	}

		}
		
	}

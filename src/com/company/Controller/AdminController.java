package com.company.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.Models.Category;
import com.company.Services.Services;

public class AdminController{
	static Scanner in = new Scanner(System.in);
	static public List<Category> categories = new ArrayList<>();
	Services services = new Services();
	public void handleAdmin() {
	      while(true) {
	    	  System.out.println("Enter your choice" + "\n" 
			  			+ "1.Add Category" +"\n" + "2.Delete Category" + 
			  			"\n" + "3.Add Product" + "\n" + "4.Delete Product" 
			  			+ "\n" + "5. update details" + "\n" +"6.logout");	
		      int processChoice = getValue();
	    	  switch(processChoice) {
	    	  case 1 :{
	    		  services.addCategory();
	    		  break;
	    	  }
	    	  case 2:{
	    		  services.deleteCategory();
	    		  break;
	    	  }
	    	  case 3:{
	    		  services.addProduct();
	    		  break;
	    	  }
	    	  case 4:{
	    		  services.deleteProduct();
	    		  break;
	    	  }
	    	  case 5:{
	    		  services.updateDetails();
	    		  break;
	    	  }
	    	  case 6:{
	    		  System.out.println("Thank you for logging in...");
	    		  return;
	    	  }
	    	  }
	      }
	}

	public static int getValue() {
		while(true) {
			try {
				int n = in.nextInt();
				return n;
			}catch(Exception e) {
				System.out.println("Please enter the correct input");
				continue;
			}
		}
	}
	
}

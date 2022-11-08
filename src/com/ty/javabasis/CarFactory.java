package com.ty.javabasis;

import java.util.Scanner;

public class CarFactory {
	
   public static Car CarFactory() {
		
	    Scanner Scanner = new Scanner(System.in);
	    
	    System.out.println("Enter the car name");
	    
	    String car_name=Scanner.next();
	     
	    if(car_name.equalsIgnoreCase("audi")) {
	    	
	    	return new Audi();
	    }
	    	
	     else if(car_name.equalsIgnoreCase("BMW")) {
	    		
	    	return new Bmw();
	    		
	    	}else {
	    		return null;
	    	}
	    	
	    }
	  
		
	}



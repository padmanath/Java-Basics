package com.ty.Resturent.project;

import java.util.Scanner;

public class Resturent {
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] s = {"pizza    ","burger    ",};
		int[] rate = new int[]{30,35};
		int[] qt = new int[rate.length];
	        int sum=0;
	        
		    boolean quit= false ;
	         
	        
	        do{
	            System.out.println("ITEM"+"\t\t\tPrice");
	            
	       
	            
			for(int i=0;i<rate.length;i++) {
				
	            System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
			}
	          
	            
	            int ch=input.nextInt();
	            
		    if(ch>0 && ch<3)
		    {
			System.out.println("enter the no of quantites of "+s[ch-1]);
			
	                 int q=input.nextInt();
	                 
		         qt[ch-1]+=q;
			
		    }
		    else
		    {
		    	
	               
	               System.out.println("sorry please reselect the iteam again .......thank you ");
	               quit=false;
	              
	            }
	        
	        System.out.println("Your Orders are:\n");
	        
		    for(int i=0;i<rate.length;i++)
		    {
	             if(qt[i]!=0)
		     {
		      sum+=qt[i]*rate[i];
	              System.out.println(s[i]+"*   "+qt[i]+"=="+qt[i]*rate[i]+"rs");
	              System.out.println("Your total bill="+sum);
	              
	              System.out.println("Thanks for choosing as.......");
	              
	 	         System.out.println("your order placed successfully.......");
		     }
		    }
	  
	       
	       
	        
	        }while(quit); 
	        
	        
	         
	         
	         
	       
	        

	}

}

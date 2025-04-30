//Program to demonstrate Lambda Expression
package com.tnsif.daynineteen;


public class WithoutLambdaExpr { 
	  
	    public static void main(String[] args) {  
	        
	    	//without lambda, 
	    	//Message implementation using anonymous class  
	     
	        Statement s=new Statement() {
	        	public String show()
	        	{
	        		return "Welcome to Lambda Expression";
	        	}};
	        	
	        	System.out.println(s.show());
	        
	        		
	       
	    }  
	}  

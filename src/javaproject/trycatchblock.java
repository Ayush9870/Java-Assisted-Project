package javaproject;

public class trycatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1, number2;
	      try {
	         number1 = 0;
		 System.out.println("Sending the Exception");
	         number2 = 62 / number1;
	         System.out.println(number2);
	               }
	    catch (ArithmeticException e) {
	         /* This block will only execute if any Arithmetic exception 
	          * occurs in try block
	          */
	         System.out.println("We can’t divide any number by zero");
	      }
	      catch (Exception e) {
	    /* This is a generic Exception handler which means it can handle              
	    /* all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	      }
	      System.out.println("Try-Catch ended.");
	   }


	}

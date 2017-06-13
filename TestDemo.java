package assignment4;
//This java file is inside package named assignment4 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

public class TestDemo    //Class declaration containing main function.
{
	public static void main(String[] args)   //main function declaration. and because it is static, program execution starts from main function. 
	{	
		int inputNumber;      //int variable to store the number input from user.
		System.out.println("Enter the integer number");
	    // for printing this on screen. we have used the inbuilt function println() of out stream of System class.
		     
  
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		inputNumber=sc.nextInt();         //Initializing inputNumber by the integer input by user.
		
		if(inputNumber==0)        //checking weather inputNumber is zero or not. 
		{
			System.out.println("You Have Entered Zero and its ASCII value is "+(char)inputNumber);  
			             //ASCII value is printed by typecasting the value of integer to character.
		}
		else
		{
			if(inputNumber>0)     //Checking the number is positive or not.
			{
				System.out.print("You Have Entered Positive Value ");
			}
			else         //if number is not positive then it will be negative because zero's case is firstly dismissed.
			{
				System.out.print("You Have Entered Negative Value ");
			}
			
			//Printing ASCII value.
			char inputValue=Integer.toString(inputNumber).charAt(0);      //Convert the accepted number to character.
			              //Here, we have used wrapper class.
			System.out.println("and ASCII value is "+(int)inputValue);      //Printing ASCII value by typecasting char into int.
		}
		
		sc.close();      //Closing the object of scanner class.
	}    //End of main function.

}   //End of class.
package gradeofstudents;
      //This java file is inside package named gradeofstudents inside src folder.
	import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

	public class GradingSystem      //Class declaration containing main function.
	{
		public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function. 
		{
			int physicsMarks,chemistryMarks,mathsMarks;        //three int variables to store the marks of three subjects PCM.
			float percentage;            //float variable to calculate percentage.
			
			//Now we want to take input of the values of marks from the user.
	      	// For taking input from the user, we have to make the object of Scanner class.
	      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
			
			System.out.println("Enter the Physics marks");   
			physicsMarks=sc.nextInt();      //Initializing variable by user input value.
			
			System.out.println("Enter the Chemistry marks");   
			chemistryMarks=sc.nextInt();      //Initializing variable by user input value.
			
			System.out.println("Enter the Maths marks");   
			mathsMarks=sc.nextInt();      //Initializing variable by user input value.
			
			percentage=((float)(physicsMarks)+(float)(chemistryMarks)+(float)(mathsMarks))/3;
			         //Calculating percentage by typecasting.
			
			if(percentage > 70.0)         //checking percentage for grades.
			{
				System.out.println("You have got "+percentage+" and A grade");
			}
			else if(percentage > 61.0 && percentage <= 70.0)
			{
				System.out.println("You have got "+percentage+"and B grade");
			}
			else
			{
				System.out.println("You have got "+percentage+" and C grade");
			}
			
			sc.close();         //Closing Scanner object.
			
		}   //End of main function.

	}    //End of class.
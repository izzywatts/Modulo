import java.util.Scanner;

public class ModuloQuiz
	{

		public static void main(String[] args)
			{
			printQuestions();

			}
		
		public static void printQuestions()
		{
			int counter = 0;
			System.out.println("How many questions would you like to answer");
			Scanner userInput = new Scanner (System.in);
			int number = userInput.nextInt();	
			for ( int i = 0; i<number-2; i++)
				{
				int randomNumber = (int)(Math.random()*10+6); 
				int randomNumber1 = (int)(Math.random()*5+1);
				System.out.println("What is" + " " + randomNumber + " " + "%" + " " +  randomNumber1);
				Scanner userInput1 = new Scanner (System.in);
				int number1 = userInput1.nextInt();
				
				if ( number1 == randomNumber % randomNumber1)
					{
					System.out.println("You are correct");
					counter++;
					}
				else
					{
					System.out.println("you are incorrect");
					}
				}
				int randomNumber = (int)(Math.random()*10+1); 
				
				System.out.println("What is" + " " + randomNumber + " " + "%" + " " +  randomNumber);
				Scanner userInput2 = new Scanner (System.in);
				int number2 = userInput2.nextInt();
					
				
				if ( number2 == randomNumber % randomNumber)
					{
					System.out.println("You are correct");
					counter++;
					}
				else
					{
					System.out.println("you are incorrect");
					}
			
			int randomNumber2 = (int)(Math.random()*10+6); 
			int randomNumber3 = (int)(Math.random()*5+1);
			System.out.println("What is "  + randomNumber3 + " % " +  randomNumber2);
			Scanner userInput3 = new Scanner (System.in);
			int number3 = userInput3.nextInt();
			
			 if (number3 == randomNumber3 % randomNumber2)
				{
				System.out.println("You are correct");
				counter++;
				}
			 
			 else
					{
					System.out.println("you are incorrect");
					}
				
			 System.out.println("You got" + " " + counter + " "+ "right");
				
		
		}
		
	}
	

	

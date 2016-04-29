import java.util.Scanner;



public class ModuloChallenges
	{

		public static void main(String[] args)
			{
			typeNumber();
			leapYear();
			printArray();
			printFizz();

			}

		public static void typeNumber()
		{
			System.out.println("Type a number");
			Scanner userInput = new Scanner (System.in);
			int number = userInput.nextInt();
			if ( number % 2== 1 )
				{
				System.out.println("Your number is odd");
				}
			if ( number % 2 == 0 )
				{
				System.out.println("Your number is even");
				}
		}
		
		public static void leapYear()
		{
			System.out.println("Type a year");
			Scanner userInput1 = new Scanner (System.in);
			int year = userInput1.nextInt();
			if ( year % 4 == 0 )
				{
				System.out.println("That is a leap year");
				}
			else 
				{
				System.out.println("That is not a leap year");
				}
		}
		
		public static void printArray()
		{
		int[]myArray= {2,5,-7,1,3,12,19,-16,4,20};
		for ( int i= 0; i< myArray.length; i++)
			{
			if ( i % 3 == 0)
				{
					System.out.println(myArray[i]);
				}
			}
		}
		
		public static void printFizz()
		{
	
		for (int i = 1; i<101; i++)
			{
				if ( i % 3 == 0 && i % 5 == 0)
					{
					System.out.println("FizzBuzz");
					}
				
				
			else if ( i % 3== 0 )
				{
				System.out.println("Fizz" );
				}
			
			else if ( i % 5 == 0 )
				{
				System.out.println("Buzz");
				}
			
			else 
				{
				System.out.println(i);
				}
			}
		
			}
		

		}
	







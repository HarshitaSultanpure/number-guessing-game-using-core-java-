import java.util.Scanner;
import java.util.Random;

class num_guessing
{
	public static void main(String ar[])
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("For Starting The Game Enter Y");
	System.out.println("For Ending The Game Enter N");
	char game = scan.next().charAt(0);
	System.out.println(game);
	if(game == 'Y'|| game == 'y')
	{
		System.out.println("Welcome To The Number Guessing Game");
	}
	else 
	{
		System.out.println("Bye - Bye Have A Good Day");
		System.exit(0);
	}
	System.out.println("...........................................");
	System.out.println("You have only 5 attempts.....BestOfLuck.....");
	Random ran = new Random();

	int randomnumber = ran.nextInt(100)+1;
	int count = 1;
	while(count<=5)
	{
		System.out.println("Enter the number you guessed between 1 - 100\n");
		int guessednumber = scan.nextInt();
		if(guessednumber == randomnumber)
		{
			System.out.println("Hey! you won! wohoooo");
			System.out.println("Hey! It took you "+count+" attempts to reach the correct answer");
			break;
		}
		else if(guessednumber < randomnumber)
		{
			System.out.println("Sorry! the correct number is greater than your guess.");
		}
		else
		{
			System.out.println("Sorry! the correct number is lower than your guess.");	
		}
		count++;
	}
	if(count>5)
	System.out.println("Sorry! the correct number is => "+randomnumber);
}
}
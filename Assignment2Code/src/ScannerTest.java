/**
 * This is a template for the user interface for Human Resources.
*/
import java.util.Scanner;


public class ScannerTest 
{
	public static void main (String [] args)
	{
		getFirstAnswer();
	}

	private static void getFirstAnswer()
	{
		System.out.println("Choose your Choice");
		System.out.println("Choice 1");
		System.out.println("Choice 2");
		System.out.println("Choice 3");
		Scanner in = new Scanner(System.in);
		String answer1 = in.next();
		if (answer1.equals("1"))
		{
			FirstChoice();
		}
		else if (answer1.equals("2"))
		{
			SecondChoice();
		}
		else if (answer1.equals("3"))
		{
			ThirdChoice();
		}
		else
		{
			tryAgain();
			getFirstAnswer();
		}
	}
	
	private static void tryAgain()
	{
		System.out.println("Invalid input, please try again.");
	}
	
	private static void FirstChoice()
	{
		System.out.println("First choice selected.");
		System.out.println("Choose your Choice");
		System.out.println("Choice 4");
		System.out.println("Choice 5");
		System.out.println("Choice 6");
		Scanner in = new Scanner(System.in);
		String answer2 = in.next();
		if (answer2.equals("4"))
		{
			System.out.println("Choice 4 selected");
		}
		else if (answer2.equals("5"))
		{
			System.out.println("Choice 5 selected");
		}
		else if (answer2.equals("6"))
		{
			System.out.println("Choice 6 selected");
		}
		else
		{
			tryAgain();
			FirstChoice();
		}
	}
	
	private static void SecondChoice()
	{
		System.out.println("Second choice selected.");
	}
	
	private static void ThirdChoice()
	{
		System.out.println("Third choice selected.");
	}
}

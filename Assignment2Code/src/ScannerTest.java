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
		System.out.println("1. Applicant");
		System.out.println("Choice 2");
		System.out.println("Choice 3");
		Scanner in = new Scanner(System.in);
		String answer1 = in.next();
		if (answer1.equals("1"))
		{
			appChoice();
		}
		else if (answer1.equals("2"))
		{
			secondChoice();
		}
		else if (answer1.equals("3"))
		{
			thirdChoice();
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
	
	private static void appChoice()
	{
		System.out.println("Applicant choice selected.");
		System.out.println("Choose your Choice");
		System.out.println("4. Create Applicant");
		System.out.println("Choice 5");
		System.out.println("Choice 6");
		Scanner in = new Scanner(System.in);
		String answer2 = in.next();
		if (answer2.equals("4"))
		{
			System.out.println("Create applicant selected");
			create();
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
			appChoice();
		}
	}
	
	
	
	private static void secondChoice()
	{
		System.out.println("Second choice selected.");
	}
	
	private static void thirdChoice()
	{
		System.out.println("Third choice selected.");
	}
	private static void create()
	{
		// Applicant used as a base.
		int jobID;
		String firstName;
		String lastName;
		String emailAddress;
		int nextApplicantID;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input job ID");
		jobID = in.nextInt();
		System.out.println("Input first name");
		firstName = in.next();
		System.out.println("Input last name");
		lastName = in.next();
		System.out.println("Input email address");
		emailAddress = in.next();
		System.out.println("Input next applicant ID");
		nextApplicantID = in.nextInt();
		
		System.out.println("Is this correct? Y/N");
		System.out.println("Job ID: " + jobID);
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Email address: " + emailAddress);
		System.out.println("Next applicant ID: " + nextApplicantID);
		boolean confirmation = confirmMessage();
		if (confirmation)
		{
			System.out.println("Job ID: " + jobID);
			System.out.println("First name: " + firstName);
			System.out.println("Last name: " + lastName);
			System.out.println("Email address: " + emailAddress);
			System.out.println("Next applicant ID: " + nextApplicantID);
			System.out.println("Confirmed");
			
			// ApplicantManager.createApplicant(these params);
		}
		else
		{
			create();
		}
	}
	
	private static boolean confirmMessage()
	{
		Scanner in = new Scanner(System.in);
		String reply = in.next();
		if (reply.equals("Y"))
		{
			return true;
		}
		else if (reply.equals("N"))
		{
			return false;
		}
		else
		{
			tryAgain();
			return confirmMessage();
		}
	}
}

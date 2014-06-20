/*
 * Rohit Krishnan
 * Apoorva Shastry
 * Gurnit Kaur Ghardhora
 * Gordon Liang
 *
 */

import java.util.Scanner;

public class HumanResources
{
	private JobManager jobManage;
	private ApplicantManager applicantManage;
	private InterviewerManager interviewerManage;
	
    public void Manager()
    {
    	//Create Job
    	Scanner in = new Scanner(System.in);
    	System.out.println("Choose corresponding # from menu:");
    	System.out.println("1. Job Manager");
    	System.out.println("2. Interviewer Manager");
    	System.out.println("3. Applicant Manager");
    	int answer1 = getInteger(in.next());
    	if(answer1 == 1)
    	{
    		createJobManager();
    	}
    	else if(answer1 == 2)
    	{
    		createInterviewerManager();
    		
    	}
    	else if(answer1 == 3)
    	{
    		createApplicantManager();
    	}
    	else
    	{
    		tryAgain();
    		Manager();
    	}
    	
   }
    
    private void createJobManager()
    {
		
		System.out.println("Please enter the corresponding # for the action you want to do:");
		System.out.println("1.Add Job");
		System.out.println("2.Delete Job");
		System.out.println("3.Mark a job as filled");

		Scanner in = new Scanner(System.in);
		int answer = getInteger(in.next());
		jobManage = new JobManager();
		
		if (answer == 1)
		{
			addingJob();
		}
		//if answer is 2, delete a job that is specified
		else if(answer == 2)
		{
			deletingJob();
		}
		else if(answer == 3)
		{
		    fillingJob();
		}
		else
		{
			tryAgain();
			createJobManager();
		}
    	
		Manager();
	}
    
    private void addingJob()
    {
    	System.out.println("Please specify the Job Name, Job Description, Job Department, "
					+ "Next Job ID & hit enter after each submission");
	 	Scanner in = new Scanner(System.in);
		String jobName = in.nextLine();
		String jobDescription = in.nextLine();
		String jobDepartment = in.nextLine();
		int nextJobID = getInteger(in.nextLine());  
		System.out.println("Is this correct? Y/N");
		System.out.println("Job Name: " + jobName);
		System.out.println("Job Description: " + jobDescription);
		System.out.println("Job Department: " + jobDepartment);
		System.out.println("Next Job ID: " + nextJobID);
		boolean confirmation = confirmMessage();
		if (confirmation)
		{
			jobManage.createJob(jobName, jobDescription, jobDepartment, nextJobID);
			System.out.println("Job confirmed.");
		}
		else
		{
			addingJob();
		}
    	
    }
     
    private void deletingJob()
    {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Please specify the JobID for the Job that you want deleted");
    	 int ID = getInteger(in.next());
    	 System.out.println("Is this correct? Y/N");
    	 System.out.println("Delete Job: " + ID);
    	 boolean confirmation = confirmMessage();
    	 if (confirmation)
    	 {
    		 jobManage.deleteJob(ID);
    		 System.out.println("Job deleted.");
    	 }
    	 else
    	 {
    		 deletingJob();
    	 }
     	
    }
     
    private void fillingJob()
    {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Please specify the ID of the Job that you would like to mark as filled");
    	 int ID = getInteger(in.next());
    	 System.out.println("Is this correct? Y/N");
    	 System.out.println("Fill Job: " + ID);
    	 boolean confirmation = confirmMessage();
    	 if (confirmation)
    	 {
    		 jobManage.markJobStatus(ID, true);
    		 System.out.println("Job filled");
    	 }
    	 else
    	 {
    		 fillingJob();
    	 }
     	
    }
     
	private void createInterviewerManager()
	{
		Scanner in = new Scanner(System.in);
		interviewerManage = new InterviewerManager();
		System.out.println("Please press the # of the corresponding option:");
		System.out.println("1.Add Interviewer");
		System.out.println("2.Delete Interviewer");
    	 
    	int answer = getInteger(in.next());
    	if(answer == 1)
    	{
    		addingInterviewer();
    	}
    	if(answer == 2)
    	{
    		deletingInterviewer();
        }
    	else
    	{
    		tryAgain();
    		createInterviewerManager();
    	}
    	
    	Manager();
	}
	
	private void addingInterviewer()
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Please specify the interviewer name and the next interviewer ID. Hit Enter after each submission.");
		String name = in.nextLine();
		int nextID = getInteger(in.next());
		System.out.println("Is this correct? Y/N");
   	 	System.out.println("Add Interviewer: " + name);
   	 	System.out.println("Next Interviewer ID: " + nextID);
   	 	boolean confirmation = confirmMessage();
   	 	if (confirmation)
   	 	{
   	 		interviewerManage.createInterviewer(name, nextID);
   	 		System.out.println("Interviewer created");
   	 	}
   	 	else
   	 	{
   	 		addingInterviewer();
   	 	}
    	
	}
	private void deletingInterviewer()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please specify the ID of the interviewer you wish to delete.");
		int deleteID = getInteger(in.next());
		System.out.println("Is this correct? Y/N");
   	 	System.out.println("Delete Interviewer ID: " + deleteID);
   	 	boolean confirmation = confirmMessage();
	 	if (confirmation)
	 	{
	 		interviewerManage.deleteInterviewer(deleteID);
	 	}
	 	else
	 	{
	 		deletingInterviewer();
	 	}
    	
	}
	
	 private void createApplicantManager()
	 {
    	System.out.println("Please enter the corresponding # for the action you want to do:");
    	System.out.println("1.Add applicant");
    	System.out.println("2.Delete Applicant");
    	System.out.println("3.Rate an Applicant");
    	System.out.println("4.Assign interviewer");
    	applicantManage = new ApplicantManager();
    	Scanner in = new Scanner(System.in);
    	
    	int answer = getInteger(in.next());
    	if(answer == 1)
    	{
    		addingApplicant();
    	}
    	else if(answer == 2)
    	{
    		deletingApplicant();
    	}
    	else if (answer == 3)
    	{
    		ratingApplicant();
    	}
    	else if (answer == 4)
    	{
    		assigningInterviewer();
    	}
    	else
    	{
    		tryAgain();
    		createApplicantManager();
    	}
    	
    	Manager();
    }
	
	private void addingApplicant()
	{
		System.out.println("Please specify the Job ID, First Name, Last Name, Email Address, and Next Applicant ID.  Press enter after entering each field");
		Scanner in = new Scanner(System.in);
		int jobID = getInteger(in.next());
		String firstName = in.nextLine();
		String lastName = in.nextLine();
		String emailAddress = in.nextLine();
	    int nextApplicantID = getInteger(in.next());
	    System.out.println("Is this correct? Y/N");
		System.out.println("Job ID: " + jobID);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Email Address: " + emailAddress);
		System.out.println("Next Applicant ID: " + nextApplicantID);
		boolean confirmation = confirmMessage();
		if (confirmation)
		{
			applicantManage.createApplicant(jobID, firstName, lastName, emailAddress, nextApplicantID);
			System.out.println("Applicant created.");
		}
		else
		{
			addingApplicant();
		}
    	
	}

	private void deletingApplicant() 
	{
		Scanner in = new Scanner(System.in);
	   	System.out.println("Please specify the Applicant ID for the Applicant that you want deleted");
	   	int ID = getInteger(in.next());
	   	System.out.println("Is this correct? Y/N");
	   	System.out.println("Delete Applicant: " + ID);
	   	boolean confirmation = confirmMessage();
	   	if (confirmation)
	   	{
	   		applicantManage.deleteApplicant(ID);
	   		System.out.println("Applicant deleted");
	   	}
	   	else
	   	{
	   		deletingApplicant();
	   	}
    	
	}

	private void ratingApplicant() 
	{
		Scanner in = new Scanner(System.in);
	   	System.out.println("Please specify the Applicant ID for the Applicant you are rating and enter their "
	   			+ "rating for Experience, Attitude, & Salary. Press Enter after each entry.");
	   	int ID = getInteger(in.next());
	   	int experience = getInteger(in.next());
	   	int attitude = getInteger(in.next());
	   	int salary = getInteger(in.next());
	   	System.out.println("Is this correct? Y/N");
	   	System.out.println("Applicant ID: " + ID);
	   	System.out.println("Experience: " + experience);
	   	System.out.println("Attitude: " + attitude);
	   	System.out.println("Salary: " + salary);
	   	boolean confirmation = confirmMessage();
	   	if (confirmation)
	   	{
	   		applicantManage.rateApplicant(experience, attitude, salary, ID);
	   		System.out.println("Applicant rated");
	   	}
	   	else
	   	{
	   		ratingApplicant();
	   	}
    	
	}

	private void assigningInterviewer() 
	{
		Scanner in = new Scanner(System.in);
   	 	System.out.println("Please specify the ID of the Interviewer and the Applicant to be interviewed." +
   	 			"Press Enter after each field.");
   	 	int interviewerID = getInteger(in.next());
   	 	int applicantID = getInteger(in.next());
   	 	System.out.println("Is this correct? Y/N");
   	 	System.out.println("Interviewer ID: " + interviewerID);
   	 	System.out.println("Applicant ID: " + applicantID);
   	 	boolean confirmation = confirmMessage();
   	 	if (confirmation)
   	 	{
   	 		applicantManage.assignInterviewer(interviewerID, applicantID);
   	 		System.out.println("Interviewer assinged");
   	 	}
   	 	else
   	 	{
   	 		assigningInterviewer();
   	 	}
    	
	}

	// Used for error output.
    private static void tryAgain()
	{
		System.out.println("Invalid input, please try again.");
	}
	
    // Asks user to confirm input. If N, calls the program again for re-input.
	private static boolean confirmMessage()
	{
		Scanner in = new Scanner(System.in);
		String reply = in.next().toUpperCase();
    	
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
			System.out.println("Is this correct? Y/N");
			return confirmMessage();
		}
	}
	
	// Use to check if input is a number.
	private static int getInteger(String s) 
	{
	    try 
	    { 
	        return Integer.parseInt(s); 
	    } 
	    catch(NumberFormatException e) 
	    { 
	    	tryAgain();
	    	System.out.println("Input must be an integer");
	    	Scanner in = new Scanner(System.in);
	    	String again = in.next();
	    	
	        return getInteger(again); 
	    }
	}
	
}
	

	
	

/*
 * Rohit
 *
 */

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;



public class HumanResources{
	private JobManager jobManage;
	private ApplicantManager applicantManage;
	private InterviewerManager interviewerManage;
	
    public void Manager(){
    	//Create Job
    	Scanner console = new Scanner(System.in);
    	System.out.println("Choose corresponding # from menu:");
    	System.out.println("1. Job Manager");
    	System.out.println("2. Interviewer Manager");
    	System.out.println("3. Applicant Manager");
    	int answer1 = getInteger(console.next());
    	if(answer1 == 1){
    		createJobManager();
    	}
    	else if(answer1 == 2){
    		createInterviewersManager();
    		
    	}
    	else if(answer1 == 3){
    		createApplicantManager();
    	}
    	else{
    		tryAgain();
    		Manager();
    	}
   }
    
    public void createJobManager(){
		
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
    
     public void addingJob()
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
     
     public void deletingJob()
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
     
     public void fillingJob()
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
     
	 public void createInterviewersManager(){
    	Scanner in = new Scanner(System.in);
    	interviewerManage = new InterviewerManager();
		 System.out.println("Please press the # of the corresponding option:");
    	 System.out.println("1.Add Interviewer");
    	 System.out.println("2.Delete Interviewer");
    	 
    	 int answer = in.nextInt();
    	 if(answer == 1){
    		 System.out.println("Enter the Name of the interviewer you wish to add, then hit enter");
    		 String name = in.next();
    		 int upper = 100;
    		 int lower = 1;
    		 int r = (int) ((Math.random() * (upper - lower)) + lower); //creates a random number between 1 & 100 for InterviewerID
    		 
    		 interviewerManage.createInterviewer(name, r);
    		 
    	 }
    	 if(answer == 2){
    		 System.out.println("Enter the ID of the interviewer you wish to delete, then hit enter");
    		 int ID = in.nextInt();
    		 interviewerManage.deleteInterviewer(ID);
         }
    	 
    	 
    	 
    	
    	
    }
    public void createApplicantManager(){
    	System.out.println("Please enter the corresponding # for the action you want to do:");
    	System.out.println("1.Add applicant");
    	System.out.println("2.Delete Applicant");
    	System.out.println("3.Rate an Applicant");
    	System.out.println("4.Assign interviewer");
    	applicantManage = new ApplicantManager();
    	Scanner in = new Scanner(System.in);
    	
    	int answer = in.nextInt();
    	if(answer == 1){
    		
    		System.out.println("Please specify the Job ID, First Name, Last Name & Email Address.  Press enter after entering each field");
    		int jobID = in.nextInt();
    		String firstName = in.next();
    		String lastName = in.next();
    		String emailAddress = in.next();
    		
    		int lower = 1;
    		int upper = 100;
    		
    		int random = (int) ((Math.random() * (upper - lower)) + lower);
    	    int nextApplicantID = random;
    		applicantManage.createApplicant(jobID, firstName, lastName, emailAddress, nextApplicantID);
    	}
    	if(answer == 2){
    		System.out.println("Please specify the Job ID for the applicant you wish to delete");
    		int id = in.nextInt();
    		applicantManage.deleteApplicant(id);
    		
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
			System.out.println("Is this correct? Y/N");
			return confirmMessage();
		}
	}
	
	// Use to check if input is a number.
	public static int getInteger(String s) 
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
	

	
	

/*
 * Rohit
 *
 */

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class HumanResources{
	public String name;
	public String department;
	public String description;
	public int ID;
	/*
	 * Inner Job class that constructs a Job object
	 */
	private HashMap<Integer, Interviewer> interviewerList = new HashMap<Integer, Interviewer>();
	private HashMap<Integer, Applicant> applicantList = new HashMap<Integer, Applicant>();
    private HashMap<Integer, Job> jobList = new HashMap<Integer, Job>(); //List to store Jobs
	
    public void Manager(){
    	//Create Job
    	Scanner console = new Scanner(System.in);
    	System.out.println("Choose corresponding # from menu:");
    	System.out.println("1. Job Manager");
    	System.out.println("2. Interviewer Manager");
    	System.out.println("3. Applicant Manager");
    	int answer1 = console.nextInt();
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
    		System.out.println("You entered an invalid choice");
    	}
   }
    
    public void createJobManager(){
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		JobManager job = new JobManager();
		
		System.out.println("Please enter the corresponding # for the action you want to do:");
		System.out.println("1.Add Job");
		System.out.println("2.Delete Job");
		System.out.println("3.Mark a job as filled");
		System.out.println("4.View Job List");
		
		
		if (answer == 1){
			System.out.println("Please specify the Job Name, Job Description, Job Department "
					+ "& hit enter after each submission");
			String jobName = in.next();
			String jobDescription = in.next();
			String jobDepartment = in.next();
			int nextjobId = 0;  //need to change this
			job.CreateJob(jobName, jobDescription, jobDepartment, nextjobId);
	}
		//if answer is 2, delete a job that is specified
		if(answer == 2){
			System.out.println("Please specify the JobID for the Job that you want deleted");
			int ID = in.nextInt();
			job.deleteJob(ID);
		}
		if(answer == 3){
			System.out.println("Please specify the name of the Job that you would like to mark as filled");
		    //To be completed
		    //choose job that you want to mark as filled, & setJobFilled(boolean)
		if(answer == 4){
			
		}
			
					
		}
	}
	 public void createInterviewersManager(){
    	Scanner in = new Scanner(System.in);
    	InterviewerManager interviewer = new InterviewerManager();
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
    		 
    		 interviewer.createInterviewer(name, r);
    		 
    	 }
    	 if(answer == 2){
    		 System.out.println("Enter the ID of the interviewer you wish to delete, then hit enter");
    		 int ID = in.nextInt();
    		 interviewer.deleteInterviewer(ID);
         }
    	 
    	 
    	 
    	
    	
    }
    public void createApplicantManager(){
    	System.out.println("Please enter the corresponding # for the action you want to do:");
    	System.out.println("1.Add applicant");
    	System.out.println("2.Delete Applicant");
    	System.out.println("3.Rate an Applicant");
    	System.out.println("4.Assign interviewer");
    	ApplicantManager applicant = new ApplicantManager();
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
    		applicant.createApplicant(jobID, firstName, lastName, emailAddress, nextApplicantID);
    	}
    	if(answer == 2){
    		System.out.println("Please specify the Job ID for the applicant you wish to delete");
    		int id = in.nextInt();
    		applicant.deleteApplicant(id);
    		
    	}
    	
    }
	
	
	
}
	

	
	

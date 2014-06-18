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
    		createInterviewerManager();
    	}
    	
    	
    	
    }
    
    
    

    public void createJobManager(){
		JobManager job = new JobManager();
		job.CreateJob(jobName, jobDescription, jobDepartment, jobId);
		
    	
    	
//    	Scanner console = new Scanner(System.in);
//		//Create Job Instance
//		System.out.println("Enter the job title, description & department name?");
//		String answer1 = console.next();
//		String answer2 = console.next();
//		String answer3 = console.next();
//		JobManager x = new JobManager();
//		x.CreateJob(answer1, answer2, answer3, 0);
		
		
		}
	
	
	
    public void createInterviewersManager(){
    	System.out.print("Press 1 to view interviewers that are assigned to a job, press 2 to exit");
    	InterviewerManager x = new InterviewerManager();
    	
    }
    public void createApplicantManager(){
    	System.out.println("");
    	ApplicantManager x = new ApplicantManager();
    	
    	
    }
	
	
	
}
	
	/*
	 * Job Parameter Accessors
	 */
	/*
	 * 
	 * 
	 * 
	 
		String name;
		String department;
		String description;
		int ID;
		/*
		 * 
		 
	    public Job(String jobName, String jobDepartment, 
				String jobDescription, int jobID){
			    name = jobName;
			    department = jobDepartment;
			    description = jobDescription;
			    ID = jobID;
			  }
	public boolean getJobStatus(){
		return false;
		
	}
	public int getJobID(){
		return ID;
	}
	public String getJobName(){
		return name;
		
	}
	public String getJobDepartment(){
		return department;
	}
	public String getJobDescription(){
		return description;
	}
	
	/*
	 * Store Jobs in list
	 */
	
	
	
	

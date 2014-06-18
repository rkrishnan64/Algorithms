/*
 * Rohit
 *
 */

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class HumanResources extends JobManager {
	public String name;
	public String department;
	public String description;
	public int ID;
	/*
	 * Inner Job class that constructs a Job object
	 */
	
	
    private ArrayList<Job> jobList = new ArrayList<Job>(); //List to store Jobs
	public void createJobManager(){
		Scanner console = new Scanner(System.in);
		//Create Job Instance
		System.out.println("What is the job title, description & department name?");
		String answer1 = console.next();
		
	}
	
	
	public void JobsManager(){
		//for(newJobList, search for match)
		
		
	}
    public void newInterviewersManager(){
    	System.out.print("Press 1 to view interviewers that are assigned to a job, press 2 to exit");
    	
    }
	
	
	public void assignInterviewer(){
		System.out.println("Press 2 to assign an interviewer, press 1 to exit");
		
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
	
	
	
	

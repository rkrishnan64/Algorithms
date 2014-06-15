import java.util.ArrayList;


public class HumanResources {
	public String name;
	public String department;
	public String description;
	public int ID;
	/*
	 * Inner Job class that constructs a Job object
	 */
	
	class Job {
		String name;
		String department;
		String description;
		int ID;
		/*
		 * 
		 */
	    public Job(String jobName, String jobDepartment, 
				String jobDescription, int jobID){
			    name = jobName;
			    department = jobDepartment;
			    description = jobDescription;
			    ID = jobID;
			  }
		
}
	/*
	 * Job Parameter Acessors
	 */
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
	public ArrayList<Job> jobList = new ArrayList<Job>(); //List to store Jobs
	
	
	public HumanResources(){
	
		
	}
	
	public void createJobManager(String jobName, String jobDepartment, 
			String jobDespcription, int jobID){
		
	}

}

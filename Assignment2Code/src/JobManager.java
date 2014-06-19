import java.util.ArrayList;
import java.util.HashMap;


public class JobManager 

{
	private int nextJobID;
	private HashMap<Integer,Job> JobList = new HashMap<Integer,Job>();
	Job j=new Job();
	public void CreateJob(String jobName,String jobDescription,String jobDepartment,int nextjobId)
	{
		
		j.setJobName(jobName);
		j.setJobDescription(jobDescription);
		j.setJobDepartment(jobDepartment);
		j.setJobID(nextjobId);
	    this.nextJobID=nextjobId;
	    JobList.put(j.getJobID(),j);
	    
	}
	
	public void deleteJob(int jobId)

	{    
		   
			j=JobList.get(jobId);
			if(j!=null)
			    {
					JobList.remove(jobId);
					System.out.println("Job deleted successfully");
				}
				else
				{
					System.out.println("incorrect jobID cnnot delete job");
		    	}
		
	}
	
	public void markJobStatus(int jobId,boolean jobFilled)
	{

		
		 
		j=JobList.get(jobId);
		if(j!=null)
		{
			j.setJobFilled(jobFilled);
			System.out.println("Job Status changed successfully");
		}
			
		
		else
		{
			System.out.println("Incorrect JobId, Cannot change the status");
		}
	}
	

	
}

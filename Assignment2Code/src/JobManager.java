import java.util.ArrayList;


public class JobManager 

{
	private int nextJobID;
	private ArrayList<Job> newJobList = new ArrayList<Job>();
	
	public void CreateJob(String jobName,String jobDescription,String jobDepartment,int nextjobId)
	{
		Job j=new Job();
		j.setJobName(jobName);
		j.setJobDescription(jobDescription);
		j.setJobDepartment(jobDepartment);
	    this.nextJobID=nextjobId;
	    newJobList.add(j);
	    
	}
	
	public void deleteJob(int jobId)

	{
		boolean jobDeleted=false;
		for(int i=0;i<newJobList.size();i++)
		{
			if(newJobList.get(i).getJobID()==jobId)
			{
				newJobList.remove(i);
				jobDeleted=true;
			}
			
		}
		if(jobDeleted==false)
		{
			System.out.println("Incorrect JobID, Cannot delete the Job");
		}
		else
		{
			System.out.println("Job Deleted successfully");
		}
		
	}
	
	public void markJobStatus(int jobId,boolean jobFilled)
	{
		//Job j=new Job();
		boolean jobStatus;
		boolean set=false;
		for (int i=0;i<newJobList.size();i++)
		{
			if(newJobList.get(i).getJobID()==jobId)
			{
			 jobStatus=newJobList.get(i).isJobFilled();
			 jobStatus=jobFilled;
			 set=true;
			}
		}
		if(set==true)
		{
			System.out.println("Job Status changed successfully");
		
		}
		else
		{
			System.out.println("Incorrect JobId, Cannot change the status");
		}
	}
	
}

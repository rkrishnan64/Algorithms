
public class Job 
{
	
private boolean jobFilled;
private int JobID;
private String JobDescription;
private String JobName;
private String JobDepartment;

public boolean isJobFilled() {
	return jobFilled;
}
public void setJobFilled(boolean jobFilled) {
	this.jobFilled = jobFilled;
}
public int getJobID() {
	return JobID;
}
public void setJobID(int jobID) {
	JobID = jobID;
}
public String getJobDescription() {
	return JobDescription;
}
public void setJobDescription(String jobDescription) {
	JobDescription = jobDescription;
}
public String getJobName() {
	return JobName;
}
public void setJobName(String jobName) {
	JobName = jobName;
}
public String getJobDepartment() {
	return JobDepartment;
}
public void setJobDepartment(String jobDepartment) {
	JobDepartment = jobDepartment;
}


}

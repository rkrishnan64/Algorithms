import java.util.ArrayList;
import java.util.HashMap;


public class ApplicantManager 
{
	//changed from arraylist to hashmap
	private HashMap<Integer, Applicant> applicantList = new HashMap<Integer, Applicant>();
	private int nextApplicantID = 0;
	
	public void createApplicant(int jobID, String firstName, String lastName, String emailAddress, int nextApplicantID)
	{
		Applicant app = new Applicant();
		app.setApplicantID(this.nextApplicantID);
		app.setEmailAddress(emailAddress);
		app.setFirstName(firstName);
		app.setLastName(lastName);
		
		this.nextApplicantID = nextApplicantID;//not sure
		
		applicantList.put(app.getApplicantID(), app);
	}
	
	public void deleteApplicant(int applicantID)
	{
		applicantList.remove(applicantID);
	}
	
	//added applicant id as parameter
	public void rateApplicant(int experienceRating, int attitudeRating, int salaryRating, int applicantID)
	{
		Applicant a = applicantList.get(applicantID);
		ApplicantRating rating = new ApplicantRating();
		rating.setRating(experienceRating, attitudeRating, salaryRating);
		a.setApplicantRating(rating.getRating());
	}
	
	public void assignInterviewer(int interviewerID, int applicantID)
	{
		Applicant a = applicantList.get(applicantID);
		int[] interviewers = a.applicantInterviewer;
				
		boolean set = false;
		
		innerloop:
		for(int j = 0; j < interviewers.length; j++)
		{
			if(interviewers[j] == 0)
			{
				interviewers[j] = interviewerID;
				set = true;
				break innerloop;
			}
		}
		if(set == false)
		{
			int[] newList = new int[interviewers.length + 1];
			newList[-1] = interviewerID;
			a.setApplicantInterviewer(newList);
			
		}
	}
}

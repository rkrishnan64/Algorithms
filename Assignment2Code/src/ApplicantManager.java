import java.util.ArrayList;


public class ApplicantManager 
{
	private ArrayList<Applicant> applicantList = new ArrayList<Applicant>();
	private int nextApplicantID = 0;
	
	public void createApplicant(int jobID, String firstName, String lastName, String emailAddress, int nextApplicantID)
	{
		Applicant app = new Applicant();
		app.setApplicantID(nextApplicantID);
		app.setEmailAddress(emailAddress);
		app.setFirstName(firstName);
		app.setLastName(lastName);
		
		this.nextApplicantID = nextApplicantID;//not sure
		
		applicantList.add(app);
	}
	
	public void deleteApplicant(int applicantID)
	{
		loop:
		for(int i = 0; i < applicantList.size(); i++)
		{
			if(applicantList.get(i).getApplicantID() == applicantID)
			{
				applicantList.remove(i);
				break loop;
			}
		}
	}
	
	public void rateApplicant(int experienceRating, int attitudeRating, int salaryRating)
	{
		
	}
	
	
	//need to finish still
	public void assignInterviewer(int interviewerID, int applicantID)
	{
		loop:
		for(int i = 0; i < applicantList.size(); i++)
		{
			if(applicantList.get(i).getApplicantID() == applicantID)
			{
				int[] interviewers = applicantList.get(i).applicantInterviewer;
				
				boolean set = false;
				
				innerloop:
				for(int j = 0; j < interviewers.length; j++)
				{
					if(interviewers[j] == 0)
					{
						interviewers[j] = interviewerID;
						set = true;
						break loop;
					}
				}
				if(set == false)
				{
					int[] newList = new int[interviewers.length + 1];
					newList[-1] = interviewerID;
					
				}
				break loop;
			}
		}
	}
}
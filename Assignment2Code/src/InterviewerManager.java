import java.util.ArrayList;


public class InterviewerManager 
{
	ArrayList<Interviewer> InterviewerList;
	int nextInterviewerID;
	
	public InterviewerManager()
	{
		InterviewerList = new ArrayList<Interviewer>();
		nextInterviewerID = 0;
	}
	
	public void createInterviewer(String Name, int newInterviewerID )
	{
		Interviewer Person = new Interviewer();
		Person.setName(Name);
		InterviewerList.add(Person);
	}
	
	public void deleteInterviewer(Interviewer InterviewerID)
	{
		InterviewerList.remove(InterviewerID);
	}
}

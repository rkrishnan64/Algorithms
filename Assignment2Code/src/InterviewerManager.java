import java.util.ArrayList;


public class InterviewerManager 
{
	ArrayList<Interviewer> InterviewerList;
	int nextInterviewerID;
	
	public InterviewerManager()
	{
		InterviewerList = new ArrayList();
	}
	
	public void createInterviewer(String Name, int newInterviewerID )
	{
		Interviewer Person = new Interviewer(Name);
		InterviewerList.add(Person);
	}
}

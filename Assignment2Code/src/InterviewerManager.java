
import java.util.HashMap;


public class InterviewerManager 
{
	private HashMap<Integer, Interviewer> InterviewerList;
	private int nextInterviewerID;
	
	public InterviewerManager()
	{
		InterviewerList = new HashMap<Integer, Interviewer>();
		nextInterviewerID = 0;
	}
	
	public void createInterviewer(String Name, int nextInterviewerID)
	{
		Interviewer Person = new Interviewer();
		Person.setName(Name);
		InterviewerList.put(this.nextInterviewerID,Person);
		this.nextInterviewerID = nextInterviewerID;
	}
	
	public void deleteInterviewer(int InterviewerID)
	{
		InterviewerList.remove(InterviewerID);
	}
}

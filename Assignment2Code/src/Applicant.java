public class Applicant 
{
	private String firstName = "";
	private String lastName = "";
	private int applicantID = 0;
	private String emailAddress = "";
	private float applicantRating = 0;
	int[] applicantInterviewer = new int[15];
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getApplicantID() {
		return applicantID;
	}
	public void setApplicantID(int applicantID) {
		this.applicantID = applicantID;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public float getApplicantRating() {
		return applicantRating;
	}
	public void setApplicantRating(float applicantRating) {
		this.applicantRating = applicantRating;
	}
	public void setApplicantInterviewer(int[] applicantInterviewer) {
		this.applicantInterviewer = applicantInterviewer;
	}


}

public class ApplicantRating {
	private float exp;
	private float att;
	private float sal;
	private float rating;
	
	public void setRating(float experience, float attitude, float salary){
			exp = experience;
			att = attitude;
			sal = salary;
		    rating = exp + att + sal/3;
		
		}
	public float getRating(){
		return rating;
		}
}

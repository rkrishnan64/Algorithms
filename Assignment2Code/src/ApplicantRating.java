
public class ApplicantRating {
	public float exp;
	public float att;
	public float sal;
	public float rating;
	
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

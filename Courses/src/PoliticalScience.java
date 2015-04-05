
public class PoliticalScience extends Courses
{
	
	/*** Constructors ***/
	
	public PoliticalScience()
	{
		super();
	}
	
	public PoliticalScience(String title, int number, String section, 
		     String department, String session, String instructor, 
		     int numberOfCredits, String description )
	{
		super( title, number, section, department, session, instructor, numberOfCredits, description );
	}	

	
	/*** Accessor Methods -- getters ***/
	
	
	
	@Override
	public String toString()
	{
		return "\nPolitical Science: " + super.toString();
	}
	

}

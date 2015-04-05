public class Physics extends Courses
{
	
	/*** Constructors ***/
	
	public Physics()
	{
		super();
	}
	
	public Physics( String title, int number, String section, 
		     String department, String session, String instructor, 
		     int numberOfCredits, String description )
	{
		super( title, number, section, department, session, instructor, numberOfCredits, description );
	}	

	
	/*** Accessor Methods -- getters ***/
	
	
	
	@Override
	public String toString()
	{
		return "\nPhysics: " + super.toString();
	}
	


}

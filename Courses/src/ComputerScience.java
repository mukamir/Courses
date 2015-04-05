
public class ComputerScience extends Courses
{
	
	/*** Constructors ***/
	
	public ComputerScience()
	{
		super();
	}
	
	public ComputerScience( String title, int number, String section, 
		     String department, String session, String instructor, 
		      int numberOfCredits, String description )
	{
		super( title, number, section, department, session, instructor, numberOfCredits, description );
	}	

	
	/*** Accessor Methods -- getters ***/
	
	
	
	@Override
	public String toString()
	{
		return "\nComputer Science: " + super.toString();
	}
	
	
}

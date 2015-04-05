
public class Courses 
{

	/*** Class Constants ***/

	private final String DEFAULT_TITLE             = "Title";
	private final int    DEFAULT_NUMBER            = 0;
	private final String DEFAULT_SECTION           = "000N";
	private final String DEFAULT_DEPARTMENT        = "Engineering";
	private final String DEFAULT_SESSION		   = "16 week session";
	private final String DEFAULT_INSTRUCTOR		   = "John Doe";
	private final int    DEFAULT_NUMBER_OF_CREDITS = 3;
	private final String DEFAULT_DESCRIPTION       = "Very interesting and useful course";


	/*** Class Variables ***/

	private String title;           // CSC
	private int    number;          // 201
	private String section;         // 002N	
	private String department;      // Computer Science, Engineering, Physics & Astronomy
	private String session;			// 8 week
	private String instructor;		//John Doe
    private int    numberOfCredits; // 5
	private String description;     // Introducton to OOPs (Java)

	
	/*** Constructors ***/
	
	public Courses()
	{
		this.title        	 = DEFAULT_TITLE;
		this.number      	 = DEFAULT_NUMBER;
		this.section     	 = DEFAULT_SECTION;
		this.department  	 = DEFAULT_DEPARTMENT;
		this.session     	 = DEFAULT_SESSION;
		this.instructor		 = DEFAULT_INSTRUCTOR;
		this.numberOfCredits = DEFAULT_NUMBER_OF_CREDITS;
		this.description     = DEFAULT_DESCRIPTION;

	}
	
	
	public Courses( String title, int number, String section, String department, String session, String instructor, int numberOfCredits, String description )
	{
		this.title           = title;
		this.number          = number;
		this.section         = section;
		this.department      = department;
		this.session 		 = session;
		this.instructor 	 = instructor;
		this.numberOfCredits = numberOfCredits;
		this.description     = description;	
	}	
	
	/*** Accessor Methods -- getters ***/
	
	public String getTitle()
	{
		return this.title;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public String getSection()
	{
		return this.section;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public String getSession()
	{
		return this.session;
	}
	
	public String getInstructor()
	{
		return this.instructor;
	}
	
	public int getNumberOfCredits()
	{
		return this.numberOfCredits;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	

	
	@Override
	public String toString()
	{
		return "\n                       Title: " 			   + this.getTitle() +
			   "\n                       Number: " 		   + this.getNumber() +
			   "\n                       Section: " 		   + this.getSection() +
			   "\n                       Department: " 	   + this.getDepartment() +
			   "\n                       Session: "    	   + this.getSession() +
			   "\n                       Instructor: " 	   + this.getInstructor() +
			   "\n                       Number of Credits: " + this.getNumberOfCredits() +
			   "\n                       Description: " 	   + this.getDescription();
	}
	
	
	/*** Mutator/Transformer Methods -- setters ***/
	
	public void setTitle( String title )
	{
		this.title = title;
	}
	
	public void setNumber( int number )
	{
		this.number = number;
	}
	
	public void setSection( String section )
	{
		this.section = section;
	}
	
	public void setDepartment( String department )
	{
		this.department = department;
	}
	
	public void setSession( String session )
	{
		this.session = session;
	}
	
	public void setInstructor( String instructor )
	{
		this.instructor = instructor;
	}
	
	public void setNumberOfCredits( int numberOfCredits )
	{
		this.numberOfCredits = numberOfCredits;
	}
	
	public void setDescription( String description )
	{
		this.description = description;
	}
}

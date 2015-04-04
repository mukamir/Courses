
public class Hockey extends Sport
{
	/*** Class Constants ***/
	public final int DEFAULT_GOALS = 0;



	/*** Class Variables ***/
	
    private int goals;

	/*** Constructors ***/
	
	public Hockey()
	{
		super();
		this.setGoals( DEFAULT_GOALS );;
	}
	
	public Hockey( String name, int year, int numberOfPlayers, int numberOfSessions, int wins, 
   	       int losses, int ties, int goals )
	{
		super( name, year, numberOfPlayers, numberOfSessions, wins, losses, ties);
		this.setGoals( goals );
	}	
	
	/*** Accessor Methods -- getters ***/
	
	public int getGoals()
	{
		return this.goals;
	}
	
	
	@Override
	public String toString()
	{
		return "\nHockey: "        + super.toString() +
			   "\n        Goals: " + getGoals();
	}
	

	/*** Mutator/Transformer Methods -- setters ***/
	
	public void  setGoals( int goals )
	{
		this.goals = goals;
	}
	
}

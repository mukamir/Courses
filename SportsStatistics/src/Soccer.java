
public class Soccer extends Sport
{
	/*** Class Constants ***/
	public final int DEFAULT_GOALS        = 0;
	public final int DEFAULT_CORNER_KICKS = 0;
	public final int DEFAULT_RED_CARDS    = 0;
	public final int DEFAULT_YELLOW_CARDS = 0;

	/*** Class Variables ***/
	
    private int goals;
    private int cornerKicks;
	private int redCards;
	private int yellowCards;

	/*** Constructors ***/
	
	public Soccer()
	{
		super();
		this.setGoals( DEFAULT_GOALS );
		this.setCornerKicks( DEFAULT_CORNER_KICKS );
		this.setRedCards( DEFAULT_RED_CARDS );
		this.setYellowCards( DEFAULT_YELLOW_CARDS );

	}
	
	
	public Soccer( String name, int year, int numberOfPlayers, int numberOfSessions, int wins, 
	      	   int losses, int ties, int goals, int cornerKicks, int redCards, int yellowCards )
	{
		super( name, year, numberOfPlayers, numberOfSessions, wins, losses, ties);
		this.setGoals( goals );
		this.setCornerKicks( cornerKicks );
		this.setRedCards( redCards );
		this.setYellowCards( yellowCards );
	}	
	
	/*** Accessor Methods -- getters ***/
	
	public int getGoals()
	{
		return this.goals;
	}
	
	public int getCornerKicks()
	{
		return this.cornerKicks;
	}
	
	public int getRedCards()
	{
		return this.redCards;
	}
	
	public int getYellowCards()
	{
		return this.yellowCards;
	}
	
	@Override
	public String toString()
	{
		return "\nSoccer: "               + super.toString() +
			   "\n        Goals: "        + getGoals() + 
			   "\n        Assists: "      + getCornerKicks() + 
			   "\n        Red Cards: "    + getRedCards() +
			   "\n        Yellow Cards: " + getYellowCards();
	}

		
	/*** Mutator/Transformer Methods -- setters ***/

	public void  setGoals( int goals )
	{
		this.goals = goals;
	}
	
	public void setCornerKicks( int cornerKicks)
	{
		this.cornerKicks = cornerKicks;
	}
	
	public void setRedCards( int redCards )
	{
		this.redCards = redCards;
	}
	
	public void setYellowCards ( int yellowCards )
	{
		this.yellowCards = yellowCards;
	}	
	
}

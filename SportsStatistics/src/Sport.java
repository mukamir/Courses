
public class Sport 
{

	/*** Class Constants ***/

	private final String DEFAULT_NAME               = "Unnamed";
	private final int    DEFAULT_YEAR  	     		= 2014;
	private final int 	 DEFAULT_NUMBER_OF_PLAYERS  = 11;
	private final int    DEFAULT_NUMBER_OF_SESSIONS = 2;
	private final int    DEFAULT_WINS               = 0;
	private final int    DEFAULT_LOSSES             = 0;
	private final int    DEFAULT_TIES               = 0;

	/*** Class Variables ***/
	
	private String name;
	private int    year;
	private int    numberOfPlayers;
    private int    numberOfSessions; // OR rounds OR times OR periods  	
	private int    wins;
	private int    losses;
	private int    ties;
	
	/*** Constructors ***/
	
	public Sport()
	{
		this.name   	      = DEFAULT_NAME;
		this.year             = DEFAULT_YEAR;
		this.numberOfPlayers  = DEFAULT_NUMBER_OF_PLAYERS;
		this.numberOfSessions = DEFAULT_NUMBER_OF_SESSIONS;
		this.wins   		  = DEFAULT_WINS;
	    this.losses 		  = DEFAULT_LOSSES;
		this.ties   		  = DEFAULT_TIES;		
	}
	
//	public Sport( String name )
//	{
//		this.setName( name );
//		this.wins   = DEFAULT_WINS;
//	    this.losses = DEFAULT_LOSSES;
//		this.ties   = DEFAULT_TIES;	
//	}
	
	public Sport( String name, int year, int numberOfPlayers, int numberOfSessions, int wins, 
			      int losses, int ties )
	{
		this.setName( name );
		this.setYear( year );
		this.setNumberOfPlayers( numberOfPlayers );
		this.setNumberOfSessions( numberOfSessions ); 
		this.setWins( wins );
	    this.setLosses( losses );
		this.setTies( ties );		
	}	
	
	/*** Accessor Methods -- getters ***/
	

	
	public String getName()
	{
		return this.name;
	}
		
	public int getYear()
	{
		return this.year;
	}
		
	public int getNumberOfPlayers()
	{
		return this.numberOfPlayers;
	}
	
	public int getNumberOfSessions()
	{
		return this.numberOfSessions;
	}
	
	public int getWins()
	{
		return this.wins;
	}
	
	public int getLosses()
	{
		return this.losses;
	}
	
	public int getTies()
	{
		return this.ties;
	}
	
	// toString()
	@Override
	public String toString()
	{
		return "\n        Name: "                      			   + getName() +
			   "\n        Year: "								   + getYear() + 
			   "\n        Number of players: "     				   + getNumberOfPlayers() + 
			   "\n        Number of sessions(rounds or periods): " + getNumberOfSessions() +
			   "\n        Wins: "                      			   + getWins() +
			   "\n        Losses: "                     		   + getLosses() +
			   "\n        Ties: "                      			   + getTies() +
			   "\n        Total Number of Matches: "   			   + calculateNumberOfMatches();
	}
	
	public int calculateNumberOfMatches()
	{
		return this.wins + this.losses + this.ties;
	}
	
	/*** Mutator/Transformer Methods -- setters ***/

	public void setName ( String name )
	{
		this.name = name;
	}
	
	public void setYear ( int year )
	{
		this.year = year;
	}
	
	public void setNumberOfPlayers( int numberOfPlayers )
	{
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public void setNumberOfSessions( int numberOfSessions )
	{
		this.numberOfSessions = numberOfSessions;
	}
	
	public void setWins( int wins )
	{
		this.wins = wins;
	}
	
	public void setLosses( int losses )
	{
		this.losses = losses;
	}
	
	public void setTies( int ties )
	{
		this.ties = ties;
	}


}


public class Boxing extends Sport
{
	/*** Class Constants ***/
	
	public final int DEFAULT_WINS_BY_KO       = 0;
	public final int DEFAULT_WINS_BY_DECISION = 0;
	public final int DEFAULT_LOSS_BY_DECISION = 0;
	
	/*** Class Variables ***/
	
    private int winsByKO;
    private int winsByDecision;
    private int lossByDecision;
    
	/*** Constructors ***/
	
	public Boxing()
	{
		super();
		this.setWinsByKO( DEFAULT_WINS_BY_KO );
		this.setWinsByDecision( DEFAULT_WINS_BY_DECISION );
		this.setLossByDecision( DEFAULT_LOSS_BY_DECISION );		
	}
	
	public Boxing( String name, int year, int numberOfPlayers, int numberOfSessions, 
			   int wins, int losses, int ties, int winsByKO, 
			   int winsByDecision, int lossByDecision )
	{
		super( name, year, numberOfPlayers, numberOfSessions, wins, losses, ties );
		this.setWinsByKO( winsByKO );
		this.setWinsByDecision( winsByDecision );
		this.setLossByDecision( lossByDecision );
	}	
	
	/*** Accessor Methods -- getters ***/
	
	
	public int getWinsByKO()
	{
		return this.winsByKO;
	}
	
	public int getWinsByDecision()
	{
		return this.winsByDecision;
	}
	
	public int getLossByDecision()
	{
		return this.lossByDecision;
	}
	
	@Override
	public String toString()
	{
		return  "\nBoxing: "                     + super.toString() +
				"\n        Wins by KO: "         + this.getWinsByKO() +
				"\n        Wins by Decision: "   + this.getWinsByDecision() +
				"\n        Losses by Decision: " + this.getLossByDecision();
	}
	
	/*** Mutator/Transformer Methods -- setters ***/

	public void setWinsByKO( int winsByKO )
	{
		this.winsByKO = winsByKO;
	}
	
	public void setWinsByDecision( int winsByDecision )
	{
		this.winsByDecision = winsByDecision;
	}
	
	public void setLossByDecision( int lossByDecision )
	{
		this.lossByDecision = lossByDecision;
	}
	
}

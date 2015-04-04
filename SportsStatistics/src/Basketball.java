/*
 * 
 */

public class Basketball extends Sport
{
	/*** Class Constants ***/
	
	public final int DEFAULT_STEALS         = 0;
	public final int DEFAULT_FOULS          = 0;
	public final int DEFAULT_HOME_GAMES_WON = 0;
	public final int DEFAULT_AWAY_GAMES_WON = 0;

	/*** Class Variables ***/
	
    private int steals;
    private int fouls;
    private int homeGamesWon;
    private int awayGamesWon;

	/*** Constructors ***/
	
	public Basketball()
	{
    	super();
    	this.setSteals( DEFAULT_STEALS );
    	this.setFouls( DEFAULT_FOULS );
    	this.setHomeGamesWon( DEFAULT_HOME_GAMES_WON );
    	this.setAwayGamesWon( DEFAULT_AWAY_GAMES_WON );
	}
	
	public Basketball( String name, int year, int numberOfPlayers, int numberOfSessions, 
	   		   int wins, int losses, int ties, int steals, int fouls, 
	   		   int homeGamesWon, int awayGamesWon )
	{
		super( name, year, numberOfPlayers, numberOfSessions, wins, losses, ties );
		this.setSteals( steals );
		this.setFouls( fouls );
		this.setHomeGamesWon( homeGamesWon );
		this.setAwayGamesWon( awayGamesWon );
	}
	
		
	/*** Accessor Methods -- getters ***/
	
	public int getSteals()
	{
		return this.steals;
	}
		
	public int getFouls()
	{
		return this.fouls;
	}
	
	public int getHomeGamesWon()
	{
		return this.homeGamesWon;
	}

	
	public int getAwayGamesWon()
	{
		return this.awayGamesWon;
	}
	
	@Override
	public String toString()
	{
		return "\nBasketball: "              + super.toString() +
			   "\n        Steals: "          + this.getSteals() +
			   "\n        Fouls: "           + this.getFouls() +
			   "\n        Home Games won : " + this.getHomeGamesWon() +
			   "\n        Away Games won : " + this.getAwayGamesWon();
	}
	
	/*** Mutator/Transformer Methods -- setters ***/

	public void setSteals( int steals )
	{
		this.steals = steals;
	}

	public void setFouls( int fouls )
	{
		this.fouls = fouls;
	}

	public void setHomeGamesWon( int homeGamesWon )
	{
		this.homeGamesWon = homeGamesWon;
	}

	public void setAwayGamesWon( int awayGamesWon )
	{
		this.awayGamesWon = awayGamesWon;
	}

	
}

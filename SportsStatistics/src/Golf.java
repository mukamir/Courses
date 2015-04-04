
public class Golf extends Sport
{
	/*** Class Constants ***/

	public final int DEFAULT_GRAND_SLAMS_WON = 0;
	public final int DEFAULT_MAJORS_PLAYED   = 0;
	public final double DEFAULT_HANDICAP     = 0;	

	/*** Class Variables ***/
	
    private int    grandSlamsWon;
    private int    majorsPlayed;
    private double handicap;

	/*** Constructors ***/
	
	public Golf()
	{
		super();
		this.setGrandSlamsWon( DEFAULT_GRAND_SLAMS_WON );
		this.setMajorsPlayed( DEFAULT_MAJORS_PLAYED );
		this.setHandicap( DEFAULT_HANDICAP );
	}
	
	public Golf( String name, int year, int numberOfPlayers, int numberOfSessions, int wins, 
	   	       int losses, int ties, int grandSlamsWon, int majorsPlayed, double handicap )
	{
		super( name, year, numberOfPlayers, numberOfSessions, wins, losses, ties );
		this.setGrandSlamsWon( grandSlamsWon );
		this.setMajorsPlayed( majorsPlayed );
		this.setHandicap( handicap );
	}	
	
	/*** Accessor Methods -- getters ***/
	
	public int getGrandSlamsWon()
	{
		return this.grandSlamsWon;
	}
	
	public int getMajorsPlayed()
	{
		return this.majorsPlayed;
	}
	
	public double getHandicap()
	{
		return this.handicap;
	}
	
	@Override
	public String toString()
	{
		return "\nGolf: "                     + super.toString() +
			   "\n        Grand Slams Won:  " + this.getGrandSlamsWon() +
			   "\n        Majors Played: "    + this.getMajorsPlayed() +
			   "\n        Handicap: "         + this.getHandicap();
	}
	

	
	/*** Mutator/Transformer Methods -- setters ***/

	public void setGrandSlamsWon( int grandSlamsWon )
	{
		this.grandSlamsWon = grandSlamsWon;
	}
	
	public void setMajorsPlayed( int majorsPlayed )
	{
		this.majorsPlayed = majorsPlayed;
	}
	
	public void setHandicap( double handicap )
	{
		this.handicap = handicap;
	}
	
}

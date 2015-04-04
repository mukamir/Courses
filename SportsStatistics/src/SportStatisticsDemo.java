import java.util.ArrayList;


public class SportStatisticsDemo 
{
/*** Class Methods ***/
	
	public void startTest()
	{
		/*** Local Variables ***/
		
		ArrayList<Sport> listOfSports = new ArrayList<Sport>();
		Soccer           soccer       = null;
		Boxing           boxing       = null;
		Hockey           hockey       = null;
		Golf             golf         = null;
		Basketball       basketball   = null;
		
		/*** Instantiate one of each electronic device ***/

		soccer     = new Soccer( "FC Barcelona", 2014, 11, 2, 37, 5, 2, 129, 258, 3, 71 );
		boxing     = new Boxing( "Gennady Golovkin", 2015, 1, 12, 32, 0, 0, 29, 32, 0);		
		hockey     = new Hockey( "Washington Capitals", 2014, 6, 3, 30, 14, 0, 230 );		
		golf       = new Golf( "Tiger Woods", 2014, 1, 18, 106, 150, 0, 7, 14, 9.8 );
		basketball = new Basketball( "Nets", 2015, 5, 4, 35, 40, 2, 26, 3, 16, 19 );
		
		/*** Store them in arraylist ***/
		
		listOfSports.add( soccer );
		listOfSports.add( boxing );
		listOfSports.add( hockey );
		listOfSports.add( golf );
		listOfSports.add( basketball );
		
		/*** Display each electronic device ***/
		
		for ( Sport sport : listOfSports )
		{
			System.out.println( sport.toString() );
		}
	}
	
	/*** Application ***/
	
	public static void main( String [] args )
	{
		SportStatisticsDemo driver = new SportStatisticsDemo();
		driver.startTest();
	}
}

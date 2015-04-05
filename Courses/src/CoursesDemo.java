import java.util.ArrayList;


public class CoursesDemo 
{
    /*** Class Methods ***/
		
		public void startTest()
		{
			/*** Local Variables ***/
			
			ArrayList<Courses> listOfCourses   = new ArrayList<Courses>();
			Math             math             = null;
			ComputerScience  computerScience  = null;
			English          english          = null;
			PoliticalScience politicalScience = null;
			Physics          physics          = null;
			
			/*** Instantiate one of each electronic device ***/

			math             = new Math( "MTH", 174, "009N", "Math/Science & Engineering Division", "16 weeks session", "Dr. C.Paldino", 5, 
			     "\n                       Prerequisites MTH 166 or MTH 164 or two units of algebra, one unit of geometry, and one-half unit each of "
			   + "\n                       trigonometry and precalculus. A Presents analytic geometry and the calculus of algebraic and transcendental "
               + "\n                       functions including the study of limits, derivatives, differentials, and an introduction to integration along "
               + "\n                       with their applications. Designed for mathematical, physical, and engineering science programs. Credit will not "
               + "\n                       be awarded for both MTH 173 and MTH 271.  Lecture 5 hours per week.");
			computerScience  = new ComputerScience( "CSC", 201, "002N", "Math/Science & Engineering Division", "16 weeks session", "Dr. T. Kanchanawanchai", 4, 
					"\n                       Prerequisite: CSC 200 or CSC 130. Corequisites: MTH 173 or division approval. Introduces algorithm and problem-solving "
			   + "\n                       methods. Emphasizes structured and object-oriented programming "
			   + "\n                       concepts, data types, I/O, control structures, functions, data abstraction, objects, elementary "
			   + "\n                       data structures, and the study and use of a high-level programming language. Lecture 4 hours per week.");
			
			english          = new English( "ENG", 111, "017N", "Language & Literature Division", "16 weeks session", "Dr. T. Greenfeld", 3, 
					"\n                       Students must successfully complete ENG 111 or its equivalent, and must be able to use "
					+ "\n                       word processing software. Continues to develop college writing with increased emphasis "
					+ "\n                       on critical essays, argumentation, and research, developing these competencies through "
					+ "\n                       the examination of a range of texts about the human experience. Requires students to "
					+ "\n                       locate, evaluate, integrate, and document sources and effectively edit for style and "
					+ "\n                       usage.  Lecture 3 hours per week.");		
			politicalScience = new PoliticalScience("PLS", 241, "060N", "Liberal Arts Division", "8 weeks session", "Dr. A. Kim", 3, "Teaches geographic, demographic, "
					+ "\n                       economic, ideological, and other factors conditioning the policies of countries, "
					+ "\n                       and discusses conflicts and their adjustment. Lecture 3 hours per week." );
			physics 		 = new Physics( "PHY", 231, "004N", "Math/Science & Engineering Division", "14 weeks session Hybrid", "Dr. Manori Nadesalingam",  5, "Prerequisite is MTH 173 - "
					+ "\n                       Calculus with Analytic Geometry I or division approval and satisfactory placement score for "
					+ "\n                       ENG 111.  Teaches principles of classical physics. Includes mechanics, wave phenomena, heat,"
					+ "\n                       electricity, magnetism, and optics, with extended coverage of selected topics. Includes "
					+ "\n                       recitation as part of the lecture. Lecture 4 hours (includes recitation). Laboratory 2 hours. "
					+ "\n                       Total 6 hours per week." );
			
			/*** Store them in arraylist ***/
			
			listOfCourses.add( math );
			listOfCourses.add( computerScience );
			listOfCourses.add( english );
			listOfCourses.add( politicalScience );
			listOfCourses.add( physics );
			
			/*** Display each electronic device ***/
			
			for ( Courses device : listOfCourses )
			{
				System.out.println( device.toString() );
			}
		}
		
		/*** Application ***/
		
		public static void main( String [] args )
		{
			CoursesDemo driver = new CoursesDemo();
			driver.startTest();
		}
}


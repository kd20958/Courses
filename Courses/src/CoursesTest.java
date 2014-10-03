/**
 * 
 * @author Kevin
 *
 */
public class CoursesTest {
	
	public static void main(String[] args) {
		CSC201 cs = new CSC201();
		MTH174 mt = new MTH174();
		
		System.out.println("-CSC201-\n ");
		cs.setTitle("Computer Science I");
		cs.setCoursen(201);
		cs.setDepartment("Science and Technology");
		cs.setDescription("Intro to Computer Science and stuff.");
		cs.writeOutput();
		
		System.out.println("\n-MTH174-\n ");
		cs.setTitle("Calculus w/ Analytical Geometry II");
		cs.setCoursen(174);
		cs.setDepartment("Math");
		cs.setDescription("Continuation of MTH173");
		cs.writeOutput();
		
	}
}

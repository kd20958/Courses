/**
 * 
 * @author Kevin
 *
 */
public class MTH174 extends Courses {
	private int coursen;
	
	public int getCoursen() {
		return coursen;
	}
	
	public void setCoursen(int newCoursen) {
		coursen = newCoursen;
	}
	
	public void writeOutput() {
		System.out.println("Course Title: " + getTitle());
		System.out.println("Course Number: " + coursen);
		System.out.println("Course Department: " + getDepartment());
		System.out.println("Course Description: " + getDescription());

	}
	
}


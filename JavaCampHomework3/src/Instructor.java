
public class Instructor extends User{
	int numberofCoursesGiven;
	String [] courseNames;
	String [] certificates;
	
	public Instructor() {
		
		
	}
	
	public Instructor(int instructorId, int numberofCoursesGiven, String[] courseNames, String[] certificates) {
		
		super();
		this.numberofCoursesGiven = numberofCoursesGiven;
		this.courseNames = courseNames;
		this.certificates = certificates;
	}
	public int getNumberofCoursesGiven() {
		return numberofCoursesGiven;
	}
	public void setNumberofCoursesGiven(int numberofCoursesGiven) {
		this.numberofCoursesGiven = numberofCoursesGiven;
	}
	public String[] getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}
	public String[] getCertificates() {
		return certificates;
	}
	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}
	
	
	
}

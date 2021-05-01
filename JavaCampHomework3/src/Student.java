
public class Student extends User{
	int numberofCoursesTaken;
	String major;
	String [] courseNames;
	
	public Student() {
		
	}
	
	public Student(int studentId, int numberofCoursesTaken, String major, String[] courseNames) {
		
		super();
		this.numberofCoursesTaken = numberofCoursesTaken;
		this.major = major;
		this.courseNames = courseNames;
	}

	public int getNumberofCoursesTaken() {
		return numberofCoursesTaken;
	}

	public void setNumberofCoursesTaken(int numberofCoursesTaken) {
		this.numberofCoursesTaken = numberofCoursesTaken;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String[] getCourseNames() {
		return courseNames;
	}

	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}
	
	
	
	
}

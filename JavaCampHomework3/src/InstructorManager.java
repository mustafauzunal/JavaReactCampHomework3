
public class InstructorManager {
	public void coursesGivenByInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� ��retmenin vermi� oldu�u kurslar : ");
		for (String course : instructor.getCourseNames()) {
			System.out.println(course);
		}
		System.out.println("-------------------------------------");
	}
}

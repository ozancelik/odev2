package odev2;

public class CourseManager {
	public void enroll(Course course) {
		System.out.println("Tebrikler," + course.name + "adlı kursa kaydoldunuz!");
		
		this.course = course;
	}
	
	Course course;

}

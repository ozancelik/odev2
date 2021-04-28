package odev2;

public class Main {
	
	public static void main(String[] args ) {
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "ÜCRETSİZ", "2 ay sürecek Yazılım Gelişti.","Engin Demiroğ");
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "ÜCRETSİZ", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", "Engin Demiroğ");
	
		Category category1 = new Category(1, "Programlama");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.enroll(course1);
		courseManager.enroll(course2);

		
		Category[] categories = {category1};
		for (Category category: categories) {
			System.out.println(category.name);
		}
		
		
		Course[] courses = {course1, course2};
		for (Course course: courses) {
			System.out.println(course.name);
		}
		
	}
}
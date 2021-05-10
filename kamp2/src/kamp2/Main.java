package kamp2;

import kamp2.Course;
import kamp2.CourseManager;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Programlamaya Giriş","Yazılımcı Geliştirici Kamp");
		Course course2 = new Course(2,"C# ve Angular","Yazılımcı Geliştirici Kamp");
		Course course3 = new Course(3,"Java ve React","Yazılımcı Geliştirici Kamp");
		
		
		Course[] courses = { course1, course2, course3};

		System.out.println("Kurs sayısı: "+courses.length);
	
		
		System.out.println(course1.getName());
		System.out.println(course2.getName());
		System.out.println(course3.getName());
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
	}

}

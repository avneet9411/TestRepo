package Creational.Factory;

public class Client {

	public static void main(String[] args) {
		
		Course c1= CourseFactory.getCourse("HLD");
		Course c2= CourseFactory.getCourse("LLD");
		
		System.out.println("HLD Course Modules: ");
			for (Module m: c1.getModules()) {
				System.out.println(m.getClass().getSimpleName());
			}

	}

}

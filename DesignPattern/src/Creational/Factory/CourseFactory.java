package Creational.Factory;

public class CourseFactory {
	
	public static Course 	getCourse(String type) {
		if (type.equals("HLD")) {
			return new HLD();
		} else if (type.equals("LLD")) {
			return new LLD();
		}
		else {
		return null;
		}
	}

}

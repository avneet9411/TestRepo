package Creational.Factory;

public class HLD extends Course{

	@Override
	public void createCourse() {
		
		modules.add(new ContentModule());
		modules.add(new MockModule());
		
	}


}

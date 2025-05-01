package Creational.AbstarctFactory;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniversityFactory  abstarctUniversityFactory=  UniversityFactory.getUniversityFactory(129);
		System.out.println(abstarctUniversityFactory.getAdmitCard("Math").getAdmitCard());
		System.out.println(abstarctUniversityFactory.getFeeCalculator("Math").getFee());
	}

}

package Creational.AbstarctFactory;

public abstract class UniversityFactory {
	
	public  static int cutoff=108;
	public static UniversityFactory getUniversityFactory(int score) {
		
		if(score>cutoff) {
			return new AktuUniversiyFactory();
		}
		else {
			return new IITUniversityFactory();
		}
		
	}
	
	public abstract AdmitCard getAdmitCard(String Course);
	
	public abstract FeeCalculator getFeeCalculator(String Course);
	
	
	
	

}

package Creational.AbstarctFactory;

public class IITUniversityFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String Course) {
			
		switch(Course) {
		
		case "Math":
				return new IITKharagpurAdmitCard();
			
			
		case "CS":
			return new IITCalicutAdmitCard();
			
			default:
				break;
		}
			return null;

	
	
	}

	@Override
	public FeeCalculator getFeeCalculator(String Course) {
		switch(Course) {
		
		case "Math":
			return new IITKharagpurFeeCalculator();
		
		
			case "CS":
		return new IITCalicutFeeCalculator();
		
		default:
			break;
		}
		return null;

	
	}

	
}

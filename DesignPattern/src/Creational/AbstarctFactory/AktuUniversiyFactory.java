package Creational.AbstarctFactory;

public class AktuUniversiyFactory extends UniversityFactory {

	@Override
	public AdmitCard getAdmitCard(String Course) {
		switch(Course) {
		
	case "Math":
			return new KietAdmitCard();
		
		 
	case "CS":
		return new AKGAdmitCard();
		
		default:
			break;
	}
		return null;
	}
	
	

	@Override
	public FeeCalculator getFeeCalculator(String Course) {
		switch(Course) {
	
	case "Math":
		return new KietFeeCalculator();
	
	
		case "CS":
	return new AKGFeeCalculator();
	
	default:
		break;
	}
	return null;
	}

}

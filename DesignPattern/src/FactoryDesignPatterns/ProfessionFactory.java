package FactoryDesignPatterns;

public class ProfessionFactory {
	
	public Profession getprofession(String profe) {
		
		if(profe.equals("doc")) {
		return new Doctor();
	    }
		else if(profe.equals("eng")){
			return new Engineer();
		} 
		return null;
	}

}

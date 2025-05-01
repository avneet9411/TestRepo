package FactoryDesignPatterns;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfessionFactory factor= new ProfessionFactory();
		
		Doctor  d=(Doctor) factor.getprofession("doc");
		d.print();
		
		Engineer  e=(Engineer) factor.getprofession("eng");
		e.print();

	}

}

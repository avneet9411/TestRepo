package FactoryDesignPatterns;

import java.util.*;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
	        
	        // Filter even numbers and collect them into a new list  
		  
		  Optional<Integer> ele=  arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		  
		  
	       		  System.out.println(ele);
		  
		  
	}
	}



package Predicate;

import java.util.function.Predicate;

public class WithLamdaAndPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> t= (i)-> i>10;
		System.out.println(t.test(65));
		
		
		
		
		
		
	}
	
	
	
}

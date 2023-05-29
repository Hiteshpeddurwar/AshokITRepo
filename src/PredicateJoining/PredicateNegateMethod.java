package PredicateJoining;

import java.util.function.Predicate;

public class PredicateNegateMethod {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate= i->i<10;
		
		System.out.println(predicate.test(12));
		
		System.out.println(predicate.negate().test(12)); //It is reverse of the condition
		
		
		
		
		
		
		
	}
	
	
	
	}

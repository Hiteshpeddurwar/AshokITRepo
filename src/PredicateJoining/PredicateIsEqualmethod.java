package PredicateJoining;

import java.util.function.Predicate;

public class PredicateIsEqualmethod {

	public static void main(String[] args) {
		
		
		Predicate<String> p= Predicate.isEqual("Hitesh");
		
		System.out.println(p.test("Hitesh"));
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

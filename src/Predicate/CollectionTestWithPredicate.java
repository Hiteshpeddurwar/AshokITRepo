package Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionTestWithPredicate {

	public static void main(String[] args) {
		
		Predicate<Collection<String>> t= c-> c.isEmpty();
		
		ArrayList<String> a= new ArrayList<>();
		a.add("Hitesh");
		System.out.println(t.test(a));
		
		
		
		
		
		
	}
	
	
	
	
	
}

package Predicate;

public class WithLambda {

public static void main(String[] args) {
	
	Numbertest t= (i)-> i>10;
	System.out.println(t.test(54));
	
	
	
	
	
	
	
}	
	
	
	
	
	interface Numbertest {
		
		public boolean test(int i);
		
	}
	
}

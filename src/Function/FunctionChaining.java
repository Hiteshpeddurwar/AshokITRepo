package Function;

import java.util.function.Function;

public class FunctionChaining {

public static void main(String[] args) {
	
	
	Function<String, String> f1= s->s.toUpperCase();
	
	System.out.println(f1.apply("hitesh"));
	
	
	Function<String, String> f2= s-> s.substring(0,5);
	
	System.out.println(f2.apply("Hitesh"));
	 
	System.out.println(f1.andThen(f2).apply("hitesh"));
	
	System.out.println(f1.compose(f2).apply("hitesh"));
	
}	
	
	
	
}

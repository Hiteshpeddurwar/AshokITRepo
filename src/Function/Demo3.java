package Function;

import java.util.function.Function;

public class Demo3 {

	// Take String as input and return string by removing the empty spaces
	
	public static void main(String[] args) {
		
		
		
		Function<String, String> f= s -> s.replaceAll(" ", "");
		
		System.out.println(f.apply("Hitesh Peddurwar"));
		
		
	}
	
	
}

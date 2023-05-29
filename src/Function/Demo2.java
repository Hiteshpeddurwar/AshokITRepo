package Function;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		
		
		Function<Integer, Integer> f= i -> i*i;
		
		System.out.println(f.apply(20));
		
		
		
	}
	
	
}

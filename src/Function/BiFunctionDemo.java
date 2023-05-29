package Function;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer, Integer> b= (i,j) -> i+j;
		
		System.out.println(b.apply(50, 60));
		
		
		
		
		
	}
	
	
	
	
	
}

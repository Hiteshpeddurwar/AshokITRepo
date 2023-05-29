package Consumer;

import java.util.function.Consumer;

public class Demo {

	
	
	public static void main(String[] args) {
		
		Consumer<String> consumer1= s-> System.out.println(s.toUpperCase());
		consumer1.accept("mumbai indians");
		
		Consumer<Integer> consumer2= p->System.out.println(p*p);
		
		consumer2.accept(50);		
	}
}

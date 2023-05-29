package Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<String> consum1= (arg)-> System.out.println(arg + " This is Hitesh");
		
		Consumer<String> consum2 =(arg) -> System.out.println(arg + " I am from Rajura");

		consum1.andThen(consum2).accept("Hello");
		
		
		
		
	}
	
	
	
}

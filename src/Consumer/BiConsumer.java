package Consumer;

public class BiConsumer {

	public static void main(String[] args) {
		
	java.util.function.BiConsumer<String,String> bc1 = (s1,s2) -> System.out.println(s1+s2);
		
		bc1.accept("Hitesh", "Peddurwar");
		
		
		java.util.function.BiConsumer<String, String> bc2=(s1,s2) -> System.out.println(s1+s2);
		
		bc2.accept("Mumbai ", " Indians");
	}
	
	
}

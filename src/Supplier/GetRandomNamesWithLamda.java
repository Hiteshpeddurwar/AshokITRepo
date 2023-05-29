package Supplier;

import java.util.function.Supplier;

public class GetRandomNamesWithLamda {

	public static void main(String[] args) {
		
		
		String[] s= {"Ishan", "Rohit","Green","SKY","Tilak","Tim"};
		
		Supplier<String> T= ()->{
			
			int m= (int) (Math.random() * 6);
			return s[m];
		};
		System.out.println(T.get());
		System.out.println(T.get());
		System.out.println(T.get());
		System.out.println(T.get());
		System.out.println(T.get());
	}
	
	
	
}

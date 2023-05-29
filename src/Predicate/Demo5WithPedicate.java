package Predicate;

import java.util.function.Predicate;

public class Demo5WithPedicate {

	public static void main(String[] args) {
		
	String [] names = {"Ishan","Rohit","Green","SKY","Jofra","Jason","Jasprit"};
	
	
	Predicate<String> t= (s)->s.charAt(0)=='J';
	
	for(String name:names) {
		if(t.test(name)) {
			System.out.println(name);
		}
		
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

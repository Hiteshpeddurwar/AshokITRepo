package Predicate;

import java.util.function.Predicate;

public class EligibilityforVoting {

	//By declaring predicate in another method
//	public static boolean IsEligibletoVote(Person person, Predicate<Person> predicate) {
//		
//		return predicate.test(person);
//		
//}
	public static void main(String[] args) {
		
		Person person = new Person("Hitesh",24);
		
		
		Predicate<Person> predicate= p -> p.age>18;
		
//		boolean isEligible = IsEligibletoVote(person, predicate);
//		
		boolean isEligible= predicate.test(person);
		
		System.out.println("Person elgible for vote  " + isEligible);
		
		
	}
	
	
	
	
	
	
	
		
		
		
	}
class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

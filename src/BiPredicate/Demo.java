package BiPredicate;

import java.util.function.BiPredicate;

public class Demo {

	public static void main(String[] args) {
		
		
		Person p= new Person(23,"Ishan");
		
		BiPredicate<Person, Integer> bipredicate= (person,minage) -> person.age> minage; 
				
				
				System.out.println(bipredicate.test(p, 18));
		
		
		
		
		
		
		
	}
	
	
	
	
}

class Person{
	
	int age;
	
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
}
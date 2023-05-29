package PredicateJoining;

import java.util.function.Predicate;

public class Demo2 {
// Conditions for Amusement park rides
	//Persons age should be greater than 20 and less than 60
	
	public static void main(String[] args) {
		
		
		
		
		Predicate<User2> p1= user->user.age>20;
		
		Predicate<User2> p2= user -> user.age<60;
		
		Predicate<User2> predicate = p1.and(p2);
		
		User2 user2= new User2(24,"HITESH");
		
		boolean test = predicate.test(user2);
		
		System.out.println("Person can go for rides " +test );
		
	}
	
	
	

}
	
class User2{
	
	int age;
	String name;
	public User2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	


}

	

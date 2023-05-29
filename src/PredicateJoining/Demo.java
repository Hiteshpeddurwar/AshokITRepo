package PredicateJoining;

import java.util.function.Predicate;

public class Demo {
public static void main(String[] args) {
	
	User user1= new User(24,"Hitesh",true);
	
	
	
	Predicate<User> p1= user -> user.age>18;
	
	Predicate<User> p2= user -> !user.isSingle;
	
	Predicate<User> predicate = p1.and(p2);
	
	System.out.println(predicate.test(user1));
	
	
}
	
	
	
	
	
}

class User {
	
	int age;
	
	String name;
	
	boolean isSingle;

	public User(int age, String name, boolean isSingle) {
		super();
		this.age = age;
		this.name = name;
		this.isSingle = isSingle;
	}
	
	
	
}
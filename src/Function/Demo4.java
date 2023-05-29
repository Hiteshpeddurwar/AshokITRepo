package Function;

import java.util.function.Function;

public class Demo4 {
// Login Functionality
	
	
	public static void main(String[] args) {
		
		//User user1= new User("Hitesh", "Hit@123");
		
		Function<User, String> f= (user) -> {if(user.uname.equals("Hitesh") && user.pwd.equals("Hit@123"))
		{return "Login Success";}
		else{return "Invalid Creditionals";}
		};
		
	System.out.println(f.apply(new User("Hitesh", "Hit@123")));
		
		
		
		
	}
	
	
	
	
}
 class User{
	 
	 
	  String uname;
	  String pwd;
	public User(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	  
	  
	  
	  
 }
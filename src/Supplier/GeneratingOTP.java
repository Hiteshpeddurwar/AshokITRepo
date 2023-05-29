package Supplier;

import java.util.function.Supplier;

public class GeneratingOTP {

	public static void main(String[] args) {
		
	
		
		Supplier<String> sup= ()->{ 
			String otp="";
		for(int i=1; i<=5;i++) {
			
			otp= otp+ (int) (Math.random()*20);
		
		}
		return otp;
		};
		
		System.out.println(sup.get());
		System.out.println(sup.get());
		
		
	}
	
	
		
}

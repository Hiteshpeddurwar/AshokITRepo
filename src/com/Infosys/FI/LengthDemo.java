package com.Infosys.FI;

public class LengthDemo {

	public static void main(String[] args) {
		
		Lengthinterface l= s-> s.length();
		
		Integer getlength = l.getlength("Mumbai Indians");
		
		System.out.println(getlength);
		
		
	}
	
	
	
	
}
@FunctionalInterface
 interface Lengthinterface {
	 public Integer getlength( String s);
	
	
}
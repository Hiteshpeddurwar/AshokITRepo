package com.Infosys.FI;

@FunctionalInterface
public interface MyInterface {

	public void sayhi();
	
	default void m1() {
		System.out.println("HIIIIIIIIII");
	}
	
	static void m2() {
		System.out.println("HIIIIII");
	}
	
}

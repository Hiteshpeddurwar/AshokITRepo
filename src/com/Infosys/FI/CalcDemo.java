package com.Infosys.FI;

public class CalcDemo {

	public static void main(String[] args) {
		
		
		Calculator c= (i,j)-> System.out.println(i+j);
		
		c.add(10, 20);
		
	}
	
	@FunctionalInterface
	interface Calculator {
		
		public void add(int i, int j);
	}
	
	
}

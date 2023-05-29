package com.Infosys.FI;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
		
//		// without Lambda
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				for( int i=1; i<=10; i++) {
//					
//					System.out.println("Welcome!!!!!!!");
//				}
//				
//			}
//			};
//		
//		Thread t = new Thread(r);
//		t.start();
//		
//	
		//With lambda
		 Runnable r= () -> { for (int i=1;i<=10;i++)  {
		 System.out.println("Welcome");
		 }
		 };
		 
		 
	
			Thread t= new Thread(r);
			 t.start();
	}
}

	


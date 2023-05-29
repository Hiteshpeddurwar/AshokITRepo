package com.Infosys.FI;

import java.util.concurrent.Callable;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
	
	Userthread ut= new Userthread();
	
	Thread t = new Thread(ut);
t.start();
	
	}
	
	
}

class Userthread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("HIIIIIIIII");
		}
	
	}
	
	
	
	
}
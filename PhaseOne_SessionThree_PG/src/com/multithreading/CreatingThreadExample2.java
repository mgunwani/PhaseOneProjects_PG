package com.multithreading;

class FirstThread implements Runnable {

	@Override
	public void run() {
		System.out.println("First Thread is Running..!!");
	}
	
}

public class CreatingThreadExample2 {
	
	public static void main(String[] args) {
		
		FirstThread t1 = new FirstThread();
		Thread thread = new Thread(t1);
		thread.start();
		
	}

}

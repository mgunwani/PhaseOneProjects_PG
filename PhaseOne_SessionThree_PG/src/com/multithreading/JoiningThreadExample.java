package com.multithreading;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " start.");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " end.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

public class JoiningThreadExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread Executing Start..");
		
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "Thread-One");
		Thread t2 = new Thread(runnable, "Thread-Two");
		Thread t3 = new Thread(runnable, "Thread-Three");
		t1.start();
		// lets wait for t1 to die 
		t1.join();
		t2.start();
//		lets wait for 1 sec or t2 to die which ever occurs first.
		t2.join(1000);
		t3.start();
		// Complete all threads before completing main thread
		t2.join();
		t3.join();
		System.out.println("Main Thread Executing Ends..");
		
	}

}

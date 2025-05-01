package Multithreading;

class t1 extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("shiv");
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
	
}

class t2 extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("shambhu");
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
	
}

public class Mainn {
	
	public static void main(String args[]) {
		t1 thread1= new t1();
		thread1.start();
		
		t2 thread2= new t2();
		try {Thread.sleep(100);} catch(Exception e){}
		thread2.start();
	}
	
	

}

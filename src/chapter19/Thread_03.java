package chapter19;

import java.util.Iterator;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread "+Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(500); //0.5초
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//for
	}
}

public class Thread_03 {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.start(); //Thread.currentThread().getName() -> Thread-0
		thread2.start(); //Thread.currentThread().getName() -> Thread-1

	}

}

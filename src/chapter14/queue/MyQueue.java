package chapter14.queue;

import java.util.ArrayList;

public class MyQueue {
	
	ArrayList<String> list = new ArrayList<String>();
		
	public void enQueue(String data) {
		list.add(data);
	}

	public String deQueue() {
		int len=list.size();
		
		if(len == 0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		return(list.remove(0));
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
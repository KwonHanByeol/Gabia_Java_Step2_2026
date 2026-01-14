package chapter14.arrayList;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;


public class List_01 {
	
	public static void main(String[] args) {
	
		//ArrayList<String> student = new ArrayList<String>();
		List<String> students = new ArrayList<String>();
		
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");
		
		//학생출력
		System.out.println("-----------Student List-----------");
		for(String student:students) {
			System.out.println(student);			
		}
		
		//특정 학생을 제거
		students.remove("Bob");
		
		//제거 후 학생출력
		System.out.println("\n==After removing Bob-----");
		for(String student:students) {
			System.out.println(student);			
		}
	}
	

}

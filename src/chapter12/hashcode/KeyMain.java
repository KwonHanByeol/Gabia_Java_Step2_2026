package chapter12.hashcode;

public class KeyMain {
	
	public static void main(String[] args) {
	
		Key hashkey1 = new Key(1);
		Key hashkey2 = new Key(1);
		Key hashkey3 = new Key("김자바");
		Key hashkey4 = new Key("김자바");
		
		//물리적인 주소
		System.out.println(hashkey1);
		System.out.println(hashkey2);
		System.out.println(hashkey3);
		System.out.println(hashkey4);
		
		//int
		if (hashkey1.equals(hashkey2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		// String
		if (hashkey3.equals(hashkey4)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
}
}

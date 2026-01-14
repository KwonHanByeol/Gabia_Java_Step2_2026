package chapter09;

public class PhoneMain_04 {

	public static void main(String[] args) {
		
		//추상클래스라 객체생성 불가
		//Phone p = new Phone("매개변수");
		
		SmartPhone smartPhone = new SmartPhone("김자바");

		System.out.println(smartPhone.owner + "님");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();
	}

}

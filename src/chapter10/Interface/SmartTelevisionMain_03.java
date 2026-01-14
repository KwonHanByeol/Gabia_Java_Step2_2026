package chapter10.Interface;

public class SmartTelevisionMain_03 {

	public static void main(String[] args) {
		
		SmartTelevision stv= new SmartTelevision();
		
		stv.turnOn();
		stv.search("www.naver.com");
		stv.setVolume(5);
		stv.turnOff();
		System.out.println();
		
		//Remote 클래스에 정의 되어 있는 메서드만 오버라이딩 된 메소드 대입
		Remote rc= stv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		//rc.search();
		System.out.println();

		// Seachable 클래스에 정의 되어 있는 메서드만 오버라이딩 된 메소드 대입
		// sc.turnOn();
		// sc.setVolume(-7);
		// sc.turnOff();
		Searchable sc = stv;
		sc.search("www.daum.net");
		
	}

}

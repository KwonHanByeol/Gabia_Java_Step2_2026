package chapter08;

//상속 키워드: extends (Fruit에 있는 모든 내용이 들어와 있음)
public class Berry extends Fruit{

	private String name;
	private String size;
	
	//초기화 메서드
	public void Set2(String a, String b) {
		name = a;
		size = b;
	}
		
	//출력
	public void Disp2() {
		System.out.println("과일이름: " + name);
		System.out.println("크기: " + size);
	}
}

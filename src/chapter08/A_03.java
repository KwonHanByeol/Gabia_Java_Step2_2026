package chapter08;

public class A_03 {

	//protected -> 같은 패키지에서는 public과 같음 즉, 호출이 쉬움
	//다른 패키지에서는 private 역할을 함 즉, 호출이 제한됨(상속 받으면 사용 가능)
	protected String field;
	
	//생성자
	
	protected void method() {
		System.out.println("A Class");
		System.out.println(field);
	}
}

package chapter08;

public class Child extends Parent{ //new Parent()

	@Override // 오버라이드는 덮어쓴다는 뜻
	public void method2() {
		System.out.println("Child-method2()");
	} 

	public void method3() {
		System.out.println("Child-method3()");
	}
	
	
}

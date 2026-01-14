package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {

		// Emoloyee 객체생성 후 메서드 사용
		Employee emp = new Employee("철수", 4000);
		emp.work();
		emp.getInfo();
		
		System.out.println();
		// Manager 객체생성 후 메서드 사용
		Manager mgr = new Manager("짱구", 5000, "영업");
		mgr.work();
		mgr.getInfo();
		mgr.approveLeave("맹구");
		
		System.out.println();
		// 상속개념이 보이게 객체생성 후 메서드 사용 (Employee와 Manager 교집합 기능만 가능)
		Employee emp2 = new Manager("유리", 4200, "기획");
		emp2.work();
		emp2.getInfo();
		//emp2.approveLeave(); 컴파일 에러(부모 타입 참조 변수는 부모 클래스에 정의된 메서드만 호출 가능)
	}

}

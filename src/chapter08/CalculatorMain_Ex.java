package chapter08;

import java.util.Scanner;

public class CalculatorMain_Ex {

	public static void main(String[] args) {
		// Main에서 실행하여 아래와 같은 결과가 나오면 성공
		// CalPlus : 30
		// CalMinus : 10
		/*
		CalPlus cal1 = new CalPlus();
		System.out.println("CalPlus: " + cal1.getResult(20, 10));
		
		CalMinus cal2 = new CalMinus();
		System.out.println("CalMinus: " + cal2.getResult(20, 10));
		*/
		
		Scanner s = new Scanner(System.in);
		
		Example[] calculators = { new CalPlus(), new CalMinus() };
				
		System.out.print("정수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요: ");
		int b = s.nextInt();
		
		System.out.println("CalPlus: " + (a + b));
		System.out.println("CalMinus: " + (a - b));
		
		// 방법1
		for (Example ca : calculators) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
		}
		System.out.println();
		
		// 방법2 : 메서드 활용
		int plus = calc(new CalPlus(), a,b);
		System.out.println("두 수의 합: " + plus);
		int minus = calc(new CalMinus(), a,b);
		System.out.println("두 수의 차: " + minus);
		
		//방법3
		System.out.println("두 수의 합: " + calc(new CalPlus(), a,b));
		System.out.println("두 수의 차: " + calc(new CalMinus(), a,b));
		
	}//main
	
	public static int calc(Example c1, int a, int b) {
		return c1.getResult(a, b);
	}

}

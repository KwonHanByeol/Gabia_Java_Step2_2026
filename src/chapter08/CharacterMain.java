package chapter08;

import java.util.Scanner;

public class CharacterMain {

	public static void main(String[] args) {
		/* Main 클래스에서 다음 조건을 만족하도록 구현하시오.
		 * 사용자로부터 기본 공격력을 입력받는다.
		 * Character 타입 배열에 Warrior, Mage 객체를 저장한다.
		 * for-each문을 이용하여 캐릭터별 공격력을 출력한다.
		 * 클래스 이름은 getClass().getSimpleName()으로 출력한다.
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("기본 공격력 : ");
		int power = s.nextInt();
		
		Character[] Character = { new Warrior(), new Mage() };
				
		for (Character ch : Character) {
			System.out.println(ch.getClass().getSimpleName() + "의 공격력 : " + ch.attack(power));
		}
		System.out.println();
	}

}


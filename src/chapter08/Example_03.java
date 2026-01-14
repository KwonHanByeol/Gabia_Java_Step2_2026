package chapter08;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("기본 공격력 : ");
		int power = s.nextInt();
		
		//메서드 활용
		System.out.println("전사의 스킬: " + useSkill(new Warrior(), power));
		System.out.println("마법사의 스킬: " + useSkill(new Mage(), power));

	}

	// ---------------------------------------------------
	// 메서드(다형성 핵심)
	public static int useSkill(Character c, int dmg) {
		return c.attack(dmg);		
	}//useSkill

}

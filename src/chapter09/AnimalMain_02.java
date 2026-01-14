package chapter09;

public class AnimalMain_02 {

	public static void main(String[] args) {

		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	//animalSound 메서드 만들어서 사용
	public static void animalSound(Animal a) {
		a.sound();
	}
	
	
	
	
	
}

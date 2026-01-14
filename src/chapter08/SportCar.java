package chapter08;

public class SportCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: "+ speed);
	}

	public static void main(String[] args) {

		SportCar ac = new SportCar();
		ac.speedUp();
		ac.stop(); //부모클래스 메서드

	}

}

package chapter09;

public class CarMain_05 {

	public static void main(String[] args) {
		
		method(new AICar());
		method(new ManualCar());
		/*
		AICar c1 = new AICar();
		ManualCar c2 = new ManualCar();
		
		c1.startCar();
		c2.drive();
		c2.stop();
		c1.drive();
		c1.stop();
		c1.turnOff();
		
		c1.run();
		*/
	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
		
		car.run();
	}

}

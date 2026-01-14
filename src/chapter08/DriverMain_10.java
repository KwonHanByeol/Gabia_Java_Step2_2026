package chapter08;

public class DriverMain_10 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		//Vehicle vehicle = new Bus();
		driver.drive(new Bus());
		System.out.println();
		
		driver.drive(new Taxi());
		
		Taxi taxi = new Taxi();
		taxi.run();
		

	}

}

package chapter08;

public class ApplianceMain_05 {

	public static void main(String[] args) {

		Appliance tv = new TV("Samsung");
		Appliance washer=new Washer("LG");
		
		tv.turnOn();
		System.out.println("----------------");
		washer.turnOn();
		
		System.out.println("----------------");
		Appliance[] list=new Appliance[3]; // 참조공간 확보
		list[0]=new Washer("LG");
		list[1]=new TV("Samsung");
		list[2]=new Washer("Daewoo");
		
		for(Appliance a:list) {
			a.turnOff();
		}

	}

}

package chapter13;

public class GenericContainerMain04 {

	public static void main(String[] args) {
		// 문자열 아이템을 저장하는 객체(stringContainer)
		
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);		
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");		
		stringContainer.printItems();
		
		//타입제한으로 사용 불가능
		//String[] stringArray = { "1", "2", "3", "4", "5" };
		//System.out.println("Sum of String array: " + stringContainer.sum(stringArray));
		
		// 숫자열 아이템을 저장하는 객체
		GenericContainer<Integer> IntegerContainer = new GenericContainer<Integer>(5);		
		IntegerContainer.addItem(10);
		IntegerContainer.addItem(20);
		IntegerContainer.addItem(30);		
		IntegerContainer.printItems();
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + IntegerContainer.sum(intArray));
		
		// 실수열 아이템을 저장하는 객체
		GenericContainer<Double> DoubleContainer = new GenericContainer<Double>(5);		
		DoubleContainer.addItem(10.1);
		DoubleContainer.addItem(20.2);
		DoubleContainer.addItem(30.3);
		DoubleContainer.printItems();
		
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Double of int array: " + DoubleContainer.sum(doubleArray));
	}

}

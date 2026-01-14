package chapter08;

public class Student extends People{

	public int studnetNo;
	
	public Student(String name, String phone, int studentNo) {
		super(name, phone); //public People(String name, String ssn)
		this.studnetNo=studentNo;
	}
}

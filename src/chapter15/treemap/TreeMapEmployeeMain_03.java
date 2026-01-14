package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {

	public static void main(String[] args) {
		
		// TreeMap 객체(employeeMap) 사원번호를 입력하면 사원의 이름과 나이가 출력
		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
		
		// 직원의 id를 키로, employeeMap에 Employee 객체 4며 추가
		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(101, member1);
		employeeMap.put(102, new Employee("Bob", 25));
		employeeMap.put(103, new Employee("Charlie", 35));
		employeeMap.put(104, new Employee("David", 28));
		
		System.out.println("==학생 성적 출력(이름순 정렬)==");
		
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		//특정 학생 조회
		int employeeId=103;
		System.out.println("\n"+employeeId+"의 성적: "+employeeMap.get(employeeId));
	}

	

}

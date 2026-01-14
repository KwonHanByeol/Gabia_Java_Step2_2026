package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoMain_05 {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 생성(exit 입력시 종료): ");
			String id = scan.next();
			
			if(id.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			
			System.out.print("패스워드 입력: ");
			int pwd = scan.nextInt();
			
			UserInfo user = new UserInfo();
			user.setId(id);
			user.setPwd(pwd);

			arr.add(user);

			System.out.println(user.getId());
			System.out.println(user.getPwd());
			System.out.println("---------");		
		}
		
		scan.close();
	
		
		
	}
}




			

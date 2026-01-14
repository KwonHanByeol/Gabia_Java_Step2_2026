package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer,String> hashMap;
	
	//생성자(HashMap 참조 메모리 확보)
	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}
	
	//addMember
	public void addMember(Member member) {
		hashMap.put(member.memberId(), member.memberName());
	}
	
	//removeMember: hashMap.containsKey(memberId)
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		} else {
			System.out.println(memberId + "번 회원이 존재하지 않습니다.");
			return false;
		}
	}
	
	public void showAllMember() {
		for (int key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}
		System.out.println();
	}

}


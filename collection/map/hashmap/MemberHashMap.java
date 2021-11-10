package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;
/*
 * Map
 * 1.key - value  쌍으로저장
 * 2.key 에는 중복된 값을 넣을수 없다. -value는 중복된 값을 넣을수 있다.
 * 3.방번호가 없다	(index 값을 가지지않는다.)\
 * 4.key는 hash 알고리즘을 사용해서 검색이 빠르다.	-hash 알고리즘은 검색이 제일 빠른 알고리즘이다.
 * 4.hsahmap - 순서없이 저장.
 * 6.treemap - 순서를 가지고 저장 출력 ( 오름차순 내림차순
 */

public class MemberHashMap {
	HashMap<Integer,Member> hashMap ; //HashMap : key values
	public MemberHashMap() {//생성자
		hashMap =new HashMap<Integer,Member>(); //HashMap 생성
	}
	
	public void addMember(Member member) {  //HashMap에 값을 저장할때 put() 메소드 사용 
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memderId) {//HashMap에서 검색할때 key를 사용해서 검색을 
											//containsKey() 키 값을 검색 
		if (hashMap.containsKey(memderId)) { //HashMap에서는 Key를 삭제하면 Key-Value가 삭제 
			hashMap.remove(memderId);
			return true;
		}
		System.out.println("그런 "+ memderId+ "가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//Iterator 를 사용해서 출력
		System.out.println("========Iterator를 사용해서 출력========");
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
		//for 문을 사용해서 출력
		System.out.println("========향상된 for문을 사용해서 출력========");
		for (Integer i : hashMap.keySet()) {
			Member member = hashMap.get(i);
			System.out.println(member);		
		}
	
	}
}

package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member2;

public class MemberTreeMap {
	/*
	 * TreeMap
	 * 1.key -Value 쌍으로 저장 key는 중복된 값을 넣을수없다. value는 다른키에 중복된 값을 넣을수 있다.
	 * 2.Tree는 정렬해서 저장, 출력 Comparable 인터페이스의 comparaTo()메소드를 재정의 해줘야한다.
	 * 		comparaTo() : 정렬의 정의 (오름차순 내림차순)
	 */
	private TreeMap<Integer, Member2> treeMap; //treemap 선언
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId); //map에서 remove (삭제) key를 삭제
			return true;
		}
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		System.out.println("========Iterator를 사용해서 출력========");
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member2 member = treeMap.get(key); // key의 value 값을 가져온다. (member 객체)
			System.out.println(member);
		}
		System.out.println("========향상된 for문을 사용해서 출력========");
		for (Integer i : treeMap.keySet()) {
			Member2 member = treeMap.get(i);
			System.out.println(member);
		}
	}
	

}

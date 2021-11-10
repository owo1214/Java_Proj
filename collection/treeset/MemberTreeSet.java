package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member2;

public class MemberTreeSet {
	private TreeSet<Member2> treeSet; //treeSet 선언
	public MemberTreeSet() {
		treeSet= new TreeSet<Member2>();
	}
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()){
			Member2 member = ir.next();
			int tempid =member.getMemberId();	//treeSet에 저장된 객체의 memberId
			if (tempid == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 memberID:"+memberId+ "를 찾을 수 없습니다.");
		return false;
	}

	public void showAllMember() {
		System.out.println("========향상된for문으로 출력========");
		for(Member2 m: treeSet) {
			System.out.println(m);
		}
		/*
		System.out.println("========Iterator으로 출력========");
		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}*/
	}


}

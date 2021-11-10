package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; // hashset 객체 변수 선언 
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();	//생성자 호출시에 객체 변수 생성 
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {	//삭제를 할 경우 memberID에 해당하는 값을 검색
		Iterator<Member> ir = hashSet.iterator();
		while (ir.hasNext()) {	//다음값이 존재하면 true
			Member member = ir.next();	//객체를 가지고 와서 member 변수에 저장 
			int tempid = member.getMemberId();//
			if (tempid == memberId) {
				hashSet.remove(member);	//방번호로 삭제하는것이 아니라 객체이름으로 삭제 
				return true;
			}
		}
		System.out.println("해당 아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : hashSet) {	//hashSet에 저장된 모든내용을 출력 
			System.out.println(member);
		}
		System.out.println();
	}
}

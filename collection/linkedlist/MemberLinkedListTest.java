package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		
		MemberLinkedList  memberArrayList = new MemberLinkedList();
		
		Member memberLee = new Member (1001,"이도현");	//member 객체생성
		Member memberSon = new Member (1002,"손흥민");
		Member memberPark = new Member (1003,"박서준");
		Member memberHong = new Member (1004,"홍길동");
		
		memberArrayList.addMember(memberLee);	//LinkedList에 객체를 추가 
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		System.out.println("=======LinkedList 모든 객체 출력=======");
		memberArrayList.showAllMember();
		
		System.out.println("=======LinkedList 특정방에 값을 추가한 경우=======");
		memberArrayList.addMember2(1, memberHong);
		memberArrayList.showAllMember();
		
		System.out.println("=======특정회원 삭제=======");
		memberArrayList.removeMember(1002); //member 값을  직접 넣어 삭제.
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}

package collection.treeset;

import collection.Member2;

public class MemberTreeSetTest {
	/*
	 * TreeSet 
	 * 1. 정렬해서 저장 comparable 인터페이스를 구현 compareTo() 메소드를 재정의 해줘야함.
	 * 2. 중복된 데이터의 저장을 허용하지 않습니다.
	 * 3. index 를 가지고 있지 않습니다. (방번호가 없음)
	 */
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet =new MemberTreeSet();
		
		Member2 memberPark = new Member2 (1001,"박진영");
		Member2 memberLee = new Member2(1002,"이순신");
		Member2 memberSon = new Member2 (1003,"손흥민");
		Member2 memberKim = new Member2 (900,"김유신");	//제일 마지막에 저장됨.
		Member2 memberSong = new Member2 (930,"송유나");
		
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberSong);
		
		memberTreeSet.showAllMember();	//comparable 인터페이스의 compareTo () 정의에 따라 정렬
										//(오름차순 정렬 , 내림차순정렬)
		System.out.println("========중복된 내용 삽입(equals() 메소드가 재정의 되어야함)========");
		Member2 memberSong2 = new Member2 (930,"송유나");
		Member2 memberSong3 = new Member2 (930,"송유나");
		memberTreeSet.addMember(memberSong2);
		memberTreeSet.addMember(memberSong3);
		
		memberTreeSet.showAllMember();
		
	}
}

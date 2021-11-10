package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		//MemberArrayList 객체를 생성하는 순간 , ArrayList<Member> 가 생성 
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//멤버 객체 생성
		Member memberLee =new Member(1001,"이지원");
		Member memberSon =new Member(1002,"손민국");
		Member memberPark =new Member(1003,"박서원");
		Member memberHong =new Member(1004,"홍길동");
		Member memberSon2 =new Member(1002,"손민국");	//중복된 값도 저장됨 
		Member memberPark2 =new Member(1003,"박서원");
		
		memberArrayList.addMember(memberLee);	//index 0 //ArrayList에 객체를 각방에 저장
		memberArrayList.addMember(memberSon);	//index 1
		memberArrayList.addMember(memberPark);	//index 2
		memberArrayList.addMember(memberHong);	//index 3
		memberArrayList.addMember(memberSon2);	//index 4
		
		/*
		 * arraylist 특징
		 *  1. 방번호 (index를 가지고 있음) , 순차적으로 저장
		 *  2. 중복된 값을 저장할수있다.
		 *  3. 방의 갯수가 무한정 늘어난다. (가변적)
		 *  4. 삭제할 경우 뒤의 방의 값이 자동으로 당겨온다.
		 *  5. 특정방에 값을 넣을때도 자동으로 값이 뒤로 밀린다.
		 */
		
		memberArrayList.showAllmember(); // arraylist내의 모든멤버를 출력 
		memberArrayList.addMember2(3, memberPark2);	// index 3번방에 memberPark2를 삽입
		memberArrayList.showAllmember();
		
		System.out.println("===============멤버비교(equalss())메소드사용===============");
		System.out.println(memberSon.equals(memberLee));
		System.out.println(memberSon.equals(memberSon2));
		
		System.out.println("===============ArrayList의 값을 삭제===============");
		memberArrayList.removeMember(1003);
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllmember();
		
	}

}

package collection;

public class Member2 implements Comparable<Member2> {
	//1. treeSet을 구현하기 위해서는 comparable 인터페이스를 구현해야한다.
	//		comparable 인터페이스의 compareTo() 메소드를 재정의 해야한다. <<정렬>>
	//2. equals() 메소드를 재정의 해줘야한다. <<중복저장>>
	
	
	
	//Comparable : treeSet에서 중복을 업애고 정렬을 해주는 인터페이스 
	//compareTo() 추상메소드를 재정의 정렬을 오름차순 정렬 ,내림정렬 정의 
	private int memberId;		//ID
	private String memberName;	//이름
	
	public Member2(int memberID, String memberName) {
		this.memberId= memberID;
		this.memberName= memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override 	//객체를 프린트(출력)하면 Object(toString() :객체의 주소를 출력)
				//재정의
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

				// Object의 equals 메소드는 객체의 주소를 비교 : true, false 를 리턴 
	@Override			// 재정의 - 객체내의 memberID를 비교 : true, false리턴 
	public boolean equals(Object obj) {	//업캐스팅 : Object 
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj; //다운캐스팅 : Member
			if (this.memberId == member.memberId) { //기존의 memberId와 들어온 객체 memberId 
				return true;
			}else {
				return false;
			}
		}
		//System.out.println("회원 정보를 찾을 수 없습니다.");
		return false;
	}

		

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override		//compareTo() 정렬 방식을 정의
	public int compareTo(Member2 member2) {
		return (this.memberId - member2.memberId);	//오름차순 정렬
		//return (this.memberId - member2.memberId) *(-1);	//내림차순 정렬  
	}
	
}

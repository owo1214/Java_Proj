package collection;

public class Member  {
	private int memberId;		//ID
	private String memberName;	//이름
	
	public Member(int memberID, String memberName) {
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
		if(obj instanceof Member) {
			Member member = (Member) obj; //다운캐스팅 : Member
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
	
	public int compareTo (Member member) {
		return (this.memberId - member.memberId);		 //오름차순 정렬(a ~ z)
		//return (this.memberId - member.memberId)*(-1); //내림차순 정렬(z ~ a)
	}
	
}

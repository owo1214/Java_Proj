package Exception_10.custom_exception;

public class IDFormatTest {
	
	private String userID;	//userID : null을 넣을 경우 - 사용자 정의 exception 발생
							//userID 8자 이상 20자 이하가 아닌경우 사용자 정의 exception 발생 
	
	public String getUserID() {
		return userID;
	}
	
		//throw : 강제로 exception 발생 시킬때 사용
		//throws: exception을 미룰떄 사용 
	
	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) { //userID 가 null 인경우  강제로 exception 발생 시킴
			throw new IDFormatException ("아이디는 null일 수 없습니다.");
		} else if (userID.length()< 8 || userID.length() > 20) {
			throw new IDFormatException ("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		
		IDFormatTest test =new IDFormatTest();
		
		String userID =null;
		
		/*
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		} */
		//userID 에 null을 넣은 경우
		try {
			test.setUserID(userID);
		}catch (IDFormatException e1) {
			System.out.println(e1.getMessage());
		} 
		
		//userID에 7자를 넣은경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

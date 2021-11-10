package Exception_10.custom_exception;	//사용자 정의 exception

public class IDFormatException extends Exception{
	public IDFormatException (String message) { //생성자
		super(message);	//부모클래스 생성자를 다시 호출 
	}
}

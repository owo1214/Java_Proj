package interface_08;

public interface PhoneInterface2 {	//인터페이스는 상수와 추상메소드 ,default 메소드 //변수는 올 수 없다
							//인터페이스 내에서는 접근제한자가 생략 되면 : <<public>> 
							//인터페이스는 외부의 사용자들이 내부 시스템에 접근하도록 하는것 기본적으로 public 옵션 
	
	int timeout = 10000; 			//상수 public static final 생략가능
	void sandCall();				//추상메소드 public abstract 생략
	void recieveCall();				//public abstract 생략 
	default void printLogo() {		//public 생략
									//default 메소드 : 인터페이스에서 구현부가 있는 메소드 
		System.out.println("로고를 프린트 합니다.");
	}

}

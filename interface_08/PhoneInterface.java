package interface_08;

public interface PhoneInterface { 	//인터페이스 : 클라이언트가 회사내부의 서버 서비스를 사용할 수 있는 접점
		//인터페이스 내부에는 상수와 추상메소드만 올 수 있다. 
		//인터페이스 내에 상수와 추상메소드: JVM 7.0 
		//인터페이스 내에 상수와 추상메소드: default 메소드- JVM 8.0 [1.8]
		//변수는 인터페이스에서 올 수 없음. 객체를 생성할 수 없다.
		//인터페이스 내에서 구현 코드가 사용된 메소드 -default 메소드(8.0): 상속/ static 메소드 / private 메소드

	public static final int timeout = 10000;
	public abstract void sandCall();
	public abstract void recieveCall();
	public default void printLogo() {
		System.out.println("로고를 프린트 합니다.");
	}


}


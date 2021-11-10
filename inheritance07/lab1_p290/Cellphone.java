package inheritance07.lab1_p290;

public class Cellphone { //모든 핸드폰에서 적용되는 코드를 상위 클래스에서 정의
							// 필드 + 메소드가 하위 클래스로 상속.
		
	String model;
	String color;
	
	void powerOn( ) {
		System.out.println("전원을 켭니다."); }
	void powerOff( ) {
		System.out.println("전원을 끕니다."); }
	void ball( ) {
		System.out.println("벨이 울립니다."); }
	void sendVoice(String message) {
		System.out.println("자기: " + message); }
	void receiveVoice(String message) {
		System.out.println("상대방: " + message); }
	void hangUp( ) {
		System.out.println("전화를 끊습니다."); }
	
}

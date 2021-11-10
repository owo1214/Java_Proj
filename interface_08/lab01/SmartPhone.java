package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	//SmartPhone 클래스는 PDA 클래스를 상속받고 있고  MobilePhoneInterface, MP3Interface를 구현하고있다.
	//다중 상속은 허용되지않는다.(자식은 하나의 부모클래스만 가진다) 단, 인터페이스 다중상속은 허용된다.
	@Override
	public void sendCall() {	//PhoneInterface에서 선언해놓은 메소드 (상속)
		System.out.println("따르릉 따르릉~~~~~~");
	}

	@Override
	public void receiveCall() {	//PhoneInterface에서 선언해놓은 메소드 (상속)
		System.out.println("전화 왔어요.");
	}

	@Override
	public void play() {	//MP3Interface
		System.out.println("음악 연주 합니다.");
	}

	@Override
	public void stop() {	//MP3Interface
		System.out.println("음악을 중단 합니다");
	}

	@Override
	public void sendSMS() {	//MobilePhoneInterface
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() {	//MobilePhoneInterface
		System.out.println("문자 왔어요.");
	}
	
	public void schedule() {	//추가로 작성한 메소드 
		System.out.println("일정 관리 합니다.");
	}

}

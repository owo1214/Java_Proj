package inheritance07.lab1_p290;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone ("자바폰" ,"검정" ,10);
		
		//Cellphone으로부터 상속 받은 필드 (Cellphone의 필드)
		System.out.println("모델: " +dmbCellphone.model);
		System.out.println("색상: " +dmbCellphone.color);
		
		//DmbCellphone의 필드
		System.out.println("채널: " +dmbCellphone.channel);
		
		
		//Cellphone으로부터 상속 받은 메소드 호출
		dmbCellphone.powerOn();		// 전원을 켠다
		dmbCellphone.ball();		// 벨이 울린다
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		//DmbCellphone의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
	}

}

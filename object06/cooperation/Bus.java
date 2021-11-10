package object06.cooperation;

public class Bus {
	int busNumber;			//버스번호  //변수이름은 첫자는 소문자 그다음 용어는 대문자로 입력해서 변수선언
	int passengerCount;		//승객수
	int money;				//수입
	
	public Bus (int busNumber) {
		this.busNumber = busNumber;
	} 
	
	public void take (int money) { //버스의 수입 및 승객수을 처리하는 메소드 
		this.money += money ;	// this.money = this.money + money
								// 기존의 버스수입에서 돈을 추가해서 다시 메모리에 저장 
		passengerCount++;		// 승객 수를 증가
	}
	public void showInfo () {
		System.out.println("버스" + busNumber +"번의 승객은" + passengerCount +
				"명이고,수입은" + money + "입니다"); 
	}
	

}

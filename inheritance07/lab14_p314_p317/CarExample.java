package inheritance07.lab14_p314_p317;

public class CarExample {

	public static void main(String[] args) {
		
	Car car = new Car();		//Car 객체 생성
        
	for(int i=1; i<=5; i++) {	//Car 객체의 run() 메소드 5번 반복실행
		int problemLocation = car.run();
         
		switch (problemLocation) {
			case 1:			//앞왼쪽 타이어가 펑크났을때 HanKooKTire로 교체
				System.out.println("앞 왼쪽 HanKooKTire로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽 ", 15);
				break;
					
			case 2:			//앞오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽 ", 13);
				break;
					
			case 3:			//뒤왼쪽 타이어가 펑크났을때 HanKooKTire로 교체
				System.out.println("뒤 왼쪽 HanKooKTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽 ", 14);
				break;
					
			case 4:			//뒤오른쪽 타이어가 펑크났을때 KumhoTire로 교체
				System.out.println("뒤 오른쪽  KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽 ", 17);
				break;
			}
		
			System.out.println("=================================="); //1회전 시 출력되는 내용을 구분 
		}
	}

}

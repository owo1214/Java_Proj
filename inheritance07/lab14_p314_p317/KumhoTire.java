package inheritance07.lab14_p314_p317;

public class KumhoTire extends Tire{
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); 
	}
	
	//메소드
	@Override
	public boolean roll() {	//출력 내용을 달리하기 위해 재정의(오버라이딩)한 roll() 메소드
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** "+ location +" KumhoTire 평크 ***");
			return false;
		}
	}
	
	

	 
	 
}
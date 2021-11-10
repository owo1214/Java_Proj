package object06.lab3;
//교재 229p

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar =new Car();
		myCar.keyTur0n();
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+ speed + "km/h");

	}

}

package interface_08.lab06_book08;

public class Driver {	//매개변수의 인터페이스화
	public void drive(Vehicle vehicle) {  //업캐스팅
		vehicle.run();
	}
}

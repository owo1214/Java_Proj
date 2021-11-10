package object06.lab3;
//교재 229p


public class Car {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTur0n() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			speed=i;
			System.out.println("달립니다.(시속:" +speed +" km/h)");
		}
	}
}

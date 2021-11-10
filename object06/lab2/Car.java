package object06.lab2;
//교재 235p

public class Car { //this : 객체 자신을 지칭한다. 
	String model;
	int speed;
	
	Car(String model) { //Car 라는 생성자
		this.model = model;
	}
	
	void setSpeed(int speed) { // setSpeed 메소드 /  메소드 앞에는 void 나 returnType을 사용
		this.speed =speed;			
	}
	
	void run() {					//for (초기값; 조건; 증가) {} - for문의 기본형식 
		for(int i=10; i<=50; i+=10) {  // i= i+10
			this.setSpeed(i);
			System.out.println(this.model +"가 달립니다."
					+ "(시속:" + this.speed + " km/h)"); //this를 생략해도 정상적으로 실행이 됨. 
		}
	}
}

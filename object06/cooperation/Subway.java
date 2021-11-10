package object06.cooperation;

public class Subway {
	public String lineNumber;   // 호선번호 "n호선" 으로 넣으려고 String으로 넣음 
	public int passengerCount;  // 승객수 
	public int money;			// 지하철 수입 
	
	public Subway (String lineNumber) { //생성자. 초기값으로 호선
		this.lineNumber = lineNumber;
	}
	public void take (int money) {
		 this.money +=money; //this.money= this.money + money 
		 passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 "+ passengerCount + 
				"명이고 , 수입은" + money + "입니다.");
		
	}

}

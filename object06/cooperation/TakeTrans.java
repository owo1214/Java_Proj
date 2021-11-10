package object06.cooperation;
public class TakeTrans {
	public static void main(String[] args) {
		//학생 두명을 생성 해서 버스와 지하철 탑승
		Student studentLee = new Student (); // 기본 생성자 호출
		Student studentJames = new Student ("James", 5000 ); //제임스 학생 객체 생성
		Student studentTomas = new Student ("Tomas", 10000); //토마스 학생 객체 생성
		Student studentKim = new Student ("Kim", 20000);
		
		Bus bus100 = new Bus (100);
		studentJames.takeBus (bus100);  // 제임스가 100번 버스를 탄다.
		studentJames.showInfo();		// 제임스의 정보 / 학생의 남은돈
		bus100.showInfo();				// 버스의 정보  / 버스의 승객수와 수입
		

		
		Subway subwayGreen = new Subway ("2호선");
		studentTomas.takeSubway(subwayGreen); // 토마스가 2호선 지하철을 탄다.
		studentTomas.showInfo();			  // 토마스의 정보 / 학생의 남은돈
		subwayGreen.showInfo();				  // 지하철의 정보 / 지하철의 승객수와 수입
		
		studentKim.takeBus(bus100);
		studentKim.takeSubway(subwayGreen);
		studentKim.showInfo();
		bus100.showInfo();
		subwayGreen.showInfo();
		
		

	}

}

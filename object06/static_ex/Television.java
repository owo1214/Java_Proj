package object06.static_ex;

public class Television {				// static 변수의 초기화
	static String company = "Samsung";	// static 변수에 초기값이 입력
	static String model = "LCD";		// static 변수에 초기값이 입력
	static String info;					// static 변수에 초기값이 할당이 되지 않은 상태
										// static  키가 들어가있지 않은 필드 초기값을 생성자에서 적용
	
	public Television () {}
	
	static {	// static 키가 적용된 필드 (변수)에 초기값을 할당 할때 사용 , 초기화 블록
		info = company + "-" + model;
	}
}

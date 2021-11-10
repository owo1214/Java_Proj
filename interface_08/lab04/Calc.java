package interface_08.lab04;

public interface Calc {
	double PI =3.14;			//상수
	int ERROR = -9999999;
	
	int add (int num1,int num2);		//추상메소드
	int substract (int num1,int num2);
	int times (int num1,int num2);
	int divide (int num1, int num2);
	
	//인터페이스에서 구현코드가 있는 메소드 
	//default 메소드 :상속 O
	//static 메소드 : stack 영역 저장, 객체생성 없이 사용되는 메소드
	//private 메소드 : 클래스 내부에서만 사용 상속X 
	//private static 메소그 : 클래스 내부에서만 사용 상속X stack 공간에서만 사용 
	default void description() {
		System.out.println("정수 계산기를 구현 합니다.");
	}
	static int total (int[] arr) {	//static 메소드 : 객체 생성 없이 사용 
		int total =0;
		for(int i : arr) {
			total += i;
		}
//		myStaticMethof();
		return total;
	}
//	private void myMethod() {	//자바 9.0부터 지원
//		System.out.println("Private 메소드 입니다.");
//	}
//	private void myStaticMethod() {	//자바 9.0부터 지원
//		System.out.println("Private static 메소드 입니다.");
//	}
}

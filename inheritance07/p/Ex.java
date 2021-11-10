package inheritance07.p;

public class Ex {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b.set();		// 상속된 클래스의 변수의 값을 할당
		b.showInfo();	// 상속된 클래스의 변수의 값을 출력
		
	}

}

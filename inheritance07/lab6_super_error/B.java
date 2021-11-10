package inheritance07.lab6_super_error;

public class B extends A{
	
	public B() {	// 오류 발생 , 상위클래스에서 매개변수 없는 생성자가 명시되지않음
	//	super();	// 생략 되어 있음.
		System.out.println("생성자 B");
	}
}

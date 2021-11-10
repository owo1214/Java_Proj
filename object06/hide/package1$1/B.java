package object06.hide.package1$1;
//교재 263p : 필드와 메소드 접근 제한 실습 ( A,B,C )

public class B {
	public B () {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
	//	a.field3 = 1;		- private 접근 불가 
		
		a.method1();
		a.method2();
	//	a.method3();		- private 접근 불가 
	}
	
	
	
}

package object06.hide.package2$2;
//교재 263p : 필드와 메소드 접근 제한 실습 ( A,B,C )

import object06.hide.package1$1.A;

public class C {
	public C () {
		A a = new A();
		a.field1 = 1;
	//	a.field2 = 1;		- default 다른 패키지에서 접근 불가
	//	a.field3 = 1;		- private 접근 불가 
		
		a.method1();
	//	a.method2();		- default 다른 패키지에서 접근 불가
	//	a.method3();		- private 접근 불가 
	}
	
}

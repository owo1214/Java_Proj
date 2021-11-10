package object06.hide.package2_2;
//교재 261p : 생성자 접근 제한 실습 ( A,B,C )


import object06.hide.package1_1.A;

public class C {
	
	A a1 = new A(true);
//	A a2 = new A(1);		-default 생산자 접근 불가
//	A a3 = new A("문자열");	-private 생산자 접근 불가
	
	
}

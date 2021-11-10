package object06.hide.package1_1;
//교재 261p : 생성자 접근 제한 실습 ( A,B,C )

public class A {

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
	
}

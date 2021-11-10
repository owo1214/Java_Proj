package object06.hide.package1$1;
//교재 263p : 필드와 메소드 접근 제한 실습 ( A,B,C )

public class A {
	
	public int field1;
	int field2;
	private int field3;
	
	
	public A() {
		field1 =1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
		
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}

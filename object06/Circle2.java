package object06;

public class Circle2 {  //생성자가 2개인 Circle 클래스, 생성자 오버로딩 (같은 
	int radius;			//생성자는 객체를 초기화 하는 역활을 한다. (멤버 변수에 기본값을 할당)
	String name;		// 멤버 변수 : 객체에 설정된 변수를 멤버변수 (힙영역에 생성됨)
	
	public Circle2 () {
		radius =1; name= "";
	}
	public Circle2 (int r, String n) {
		radius = r; name =n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}


	public static void main(String[] args) {
		Circle2 pizza = new Circle2 (10,"자바 피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle2 donet = new Circle2 ();
		donet.name = "도넛 피자";
		area = donet.getArea();
		System.out.println(donet.name + "의 면적은 "+area);
	}

}

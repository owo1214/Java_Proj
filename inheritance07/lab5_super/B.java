package inheritance07.lab5_super;

public class B extends A{
	
	public B () {
		System.out.println("생성자 B");
	}
	
	public B (int x) {
		//super(); 		//생략되어 있을경우 기본값
		super(x); 		//상위의 생성자를 호출 , 매개변수가 있는 생성자를 호출
		System.out.println("매개변수 생성자 B: "+ x);
	}
}

package basic_class_11.object;

public class String_Ex {

	public static void main(String[] args) {
		//String Integer Boolean 등은 toString() 메소드가 재정의 되어져 있다. 
		//String Integer Boolean 등은 equals() 메소드가 재정의 되어져 있다. 
		
		//String 을 객체화 해서 출력 : Heap 영역에 저장 
		String str1 = new String ("홍길동");
		String str2 = new String ("홍길동");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);	// "==" : 객체를 비교할때 객체의 번지를 비교한다
		System.out.println(str1.equals(str2));	//equals () :값을 비교함
		
		System.out.println("=================================");
		
		//String 을 객체화 하지않고 변수에 저장해서 출력 : 값이 상수풀에 저장이됨 (같은이름이 있으면 그값의 주소)
		String str3 = "이순신";
		String str4 = "이순신";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);	
		System.out.println(str3.equals(str4));
	}

}

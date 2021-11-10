package object06.final_ex;

public class Person {
	final String nation = "Korea";	// 기본 초기 값을 할당
		//final : 변수 앞에, <== 상수 (값을 변경할 수 없다.)
		//final : 클래스 앞에, <== 자식객체를 허용하지 않는다. (상속)
		//final : 메소드 앞에, <== 메소드 오버라이딩이 불가한 메소드 (상속)
			//* 메소드 오버라이딩 : 상속 관계에서 부모 클래스에서 선언된 메소드를 자식 클래스에서 재정의해서 사용 
			//* 메소드 오버로딩 : 동일한 메소드 이름으로 매개변수를 달리해서 메소드를 실행 
	final String ssn; // 주민번호 , 객체를 생성할때 초기값을 할당,수정을 하지 못하도록 설정
	String name;	// 변수는 이름을 소환할때 소문자로 사용함, 상수는 대문자로 사용함 
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

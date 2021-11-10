package inheritance07.lab2;

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.set(); 		//서브 클래스의 set() 메소드 실행, 부모 클래스의 필드에 값 할당
		
		System.out.println(s.age);		//슈퍼 클래스의 나이를 출력
		System.out.println(s.name);		//슈퍼 클래스의 이름을 출력
		System.out.println(s.height);	//슈퍼 클래스의 키를 출력
		System.out.println(s.getWeight());	//슈퍼 클래스의 몸무게를 출력

	}

}

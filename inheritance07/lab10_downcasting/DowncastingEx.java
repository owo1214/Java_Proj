package inheritance07.lab10_downcasting;

public class DowncastingEx {
	public static void main(String[] args) {
		System.out.println("=========업캐스팅=========");
		Person p = new Student ("홍길동") ;	//다운 캐스팅: 부모클래스의 필드와 메소드만 접근
											//단, 오버라이딩된 메소드 호출시 동적 바인딩이 작동된다.
		p.id = "1000";
		System.out.println(p.id+ ","+ p.name); //부모클래스의 필드, 메소드만 접근
		
		
		
		System.out.println("=========다운캐스팅=========");
		Student s =(Student) p ; //다운 캐스팅: 부모와 자식 클래스의 필드와 메소드를 모두 접근 
								//강제로 자료형을 명시
		s.department ="HR";		//Student
		s.grade ="4" ;			//Student
		s.id = "1001";			//Person
		s.name ="김유신";			//Person
		System.out.println(s.id+","+s.name+","+s.grade+","+s.department);		
	
	}
}

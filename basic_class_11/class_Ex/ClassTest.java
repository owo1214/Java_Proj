package basic_class_11.class_Ex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pC1 = person.getClass();	//Object class 의 getClass() 메소드 사용
		System.out.println(pC1.getName());
		
		Class pC2 = Person.class;	//직접 class 파일 대입
		System.out.println(pC2.getName());
		
		
		Class pC3 = Class.forName("basic_class_11.class_Ex.Person");	//class이름으로 가져오기
		System.out.println(pC3.getName());
		
		System.out.println(person.getClass());
	}
}

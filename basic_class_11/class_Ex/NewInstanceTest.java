package basic_class_11.class_Ex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);	//new 를 사용해서 객체생성 
		
		Class pC = Class.forName("basic_class_11.class_Ex.Person");
		Person person2 = (Person) pC.newInstance();	//class 파일로 객체 생성 
			//newInstance() : *.class 파일로 객체 생성 
		System.out.println(person2);
	}

}

package basic_class_11.class_Ex;

public class Person {
	private String name;	//생성자 setter 를 통해서 할당 :private 
	private int age;
	
	public Person () {}		//기본생성자
	
	public Person (String name) {	//생성자: 매개변수가 1개 
		this.name = name;
	}
	public Person (String name, int age) {//생성자: 매개변수가 2개
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

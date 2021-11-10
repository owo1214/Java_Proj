package basic_class_11.object;

class  Student{

	int studentID;
	String studentName;
	
	public Student (int studentID ,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + "," + studentName;
	}
	
}


public class EqualTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student (100,"이순신") ;
		Student studentLee2 = studentLee; //객체의 주소를 복사 
		Student studentLee3 = new Student(100,"이순신");
		
		
		
		if (studentLee == studentLee2) {	// "=="
			System.out.println("두 주소는 같습니다.");
		}else {
			System.out.println("두 주소는 다릅니다.");
		}
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee 와 studentLee2는 동일합니다.");
		}else {
			System.out.println("studentLee 와 studentLee2는 동일하지 않습니다.");
		}
		System.out.println("================================================");
		if (studentLee == studentLee3) {
			System.out.println("두 주소는 같습니다.");
		}else {
			System.out.println("두 주소는 다릅니다.");
		}
		if (studentLee.equals(studentLee3)) {
			System.out.println("studentLee 와 studentLee3는 동일합니다.");
		}else {
			System.out.println("studentLee 와 studentLee3는 동일하지않습니다.");
		}
		
		Object o = studentLee;	//업캐스팅
		
		//object class 의 equals ()메소드는 두 객체에 주소를 비교한다. 
		//객체의 값을 비교하기 위해서는 object class의 equals() 메소드를 재정의 해야한다.
		System.out.println(studentLee);
	}
}

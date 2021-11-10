package basic_class_11.object;

class Student4 {	
	int studentID;
	String studentName;
	int grade;
	
	public Student4(int studentID, String studentName, int grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade =grade;
	}
	//문제1. toString() 메소드 재정의 해서 객체를 출력했을때, 이름과 학년을 출력 
	//문제2. equals () 메소드 재정의 해서 studentName 같을때 True를 리턴받도록 재정의 
	//문제3. hashCode() 메소드도 정의

	@Override
	public String toString() {
		return studentName+","+grade;
	}

	@Override
	public boolean equals(Object obj) {		//업캐스팅
		if(obj instanceof Student4) {
			Student4 st = (Student4)obj;
			if (studentName == st.studentName) {	//다운캐스팅
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
	
	
}

public class EqualTest3_T {

	public static void main(String[] args) {
		Student4 std3 = new Student4(100,"강감찬",3);
		Student4 std4 = new Student4(200,"강감찬",4);
		Student4 std5 = new Student4(300,"홍길동",5);
		Student4 std6 = std5;	//객체의 주소복사
		System.out.println(std3);							//16진수 hashcode : 메모리
		System.out.println(System.identityHashCode(std3));	//10진수
		System.out.println(System.identityHashCode(std4));
		System.out.println(System.identityHashCode(std5));
		System.out.println(System.identityHashCode(std6));
		System.out.println(std3==std4); //객체의 주소 비교 
		
		System.out.println(std3.equals(std4));	//오버라이딩: studentName 같을때 : True
			//object class 의 상속되는 equals() 메소드는 객체 주소값을 비교 
		System.out.println(std4.equals(std5));
		System.out.println(std3.equals(std6));
	}
}

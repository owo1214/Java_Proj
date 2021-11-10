package basic_class_11.object;

class Student3 {	
	int studentID;
	String studentName;
	int grade;
	
	public Student3(int studentID, String studentName, int grade) {
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
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 st = (Student3)obj;
			if (studentName == st.studentName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return grade;
	}
	
	
	
}

public class EqualTest3 {

	public static void main(String[] args) {
		Student3 Lee = new Student3(1000,"이순신",3);
		Student3 Lee2 = new Student3(2000,"이순신",4);
		
		System.out.println(Lee);
		System.out.println(Lee == Lee2); 
		System.out.println(Lee.equals(Lee2)); 
		
		System.out.println("Lee의 hashCode: " + Lee.hashCode());
		System.out.println("Lee2의 hashCode: " + Lee2.hashCode());
		
		System.out.println("Lee의 실제 주소값: "+ System.identityHashCode(Lee));
		System.out.println("Lee2의 실제 주소값: " + System.identityHashCode(Lee2));
	}
}

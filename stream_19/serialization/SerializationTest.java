package stream_19.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직열화 (Serialization) :객체(인스턴스)를 파일에 저장. 
  //1. Serializable : 간단한 컨트롤로 직열화
  //2. Externalizable : 세부적인 컨트롤이 가능하면서 직열화 (메소드가 제공됨)

	//ObjectOutputStream : 객체를 파일로 저장 (직열화) 보조 스트림. 
	//직열화는 Serializable 인터페이스를 구현한 객체만이 직열화를 할 수 있다. 
	//직열화의 SerialVersionUID 가 생성되어 있어야 한다. <== 고유번호 
	//Serializable <== maker Interface ( 구현 코드가 없는 인터페이스 )

class Person implements Serializable {	

	private static final long serialVersionUID = 5127700800134372584L;	
		//직열화 고유 번호 (직열화 버젼 ID) 	
	String name;	// 이름
	transient String job;		// 직업	transient : 직열화에서 직열화 되지 않음. 
	
	public Person() {}	//기본 생성자
	public Person(String name, String job) {	//생성자 : 변수의 값을 초기화 
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {		//객체 자체를 출력했을때, ( 이름,직업 )
		return name + " , " + job;		
	}	
}

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		oos.writeObject(personAhn);    //객체를 저장.
		oos.writeObject(personKim);
		System.out.println("=== 직열화 성공 ===");
		
			

	}

}
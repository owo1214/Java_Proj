package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Exteralizabale : 세부적인 컨트롤을 하면서 직열화 기능 (메소드 제공됨)

class Dog implements Externalizable{
	String name;
	int age;
	public Dog () {}
	public Dog (String name, int age){
		this.name = name; this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "," + age ;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);   //출력시 호출되는 메소드 (아웃풋 스트림)
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();	//입풋시 호출되는 메소드 (인풋 스트림)
		age = in.readInt();
	}
}


public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog myDog = new Dog ("댕댕이", 3);
		Dog yourDog = new Dog ("누렁이", 2);
		
		FileOutputStream fis = new FileOutputStream ("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fis);
		
		oos.writeObject(myDog);
		oos.writeObject(yourDog);
		
		System.out.println("===직열화 성공(Externalizable)");
		
		
		
		

	}

}
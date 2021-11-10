package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Externalizable{
	String name;		// Externalizable 처리, (D:\Temp\animal.dat)
	int age;			// 객체 2개(사자:10,호랑이:20) 직열화 해서 저장, 읽어오기 , 두변수 모두 						
	
	public Animal () {}	//직열화 할때 기본 생성자 꼭 넣어줘야함.
	public Animal (String name,int age) {
	this.name = name; this.age = age;
	}
	@Override
	public String toString() {
		return name+": " +age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
	

}


public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Animal a1 = new Animal("사자",10);
		Animal a2 = new Animal("호랑이",20);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		oos.writeObject(a1);
		oos.writeObject(a2);
		System.out.println("==== 직열화 성공 ====");
		
		System.out.println("==== 직열화된 파일에서 값 읽어 오기 ====");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\animal.dat");
		ObjectInputStream ois = new ObjectInputStream (fis);
		
		Animal t1 = (Animal) ois.readObject();
		Animal t2 = (Animal) ois.readObject();
		
		System.out.println(a1);
		System.out.println(a2);
	}
}

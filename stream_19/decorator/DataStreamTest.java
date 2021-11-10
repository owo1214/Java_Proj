package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\data.txt"); //기반스트림
		FileInputStream fis = new FileInputStream("C:\\Users\\SMK\\Desktop\\SMH\\Temp\\data.txt"); 
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
			//다양한 형식의 자료형을 처리, 주의 :아웃풋 자료형과 인풋 자료형이 동일해야함.
		
		dos.writeByte(100); //byte 출력
		dos.writeChar('A');	//char 자료형을 출력 
		dos.write(10);		//int출력
		dos.writeFloat(3.14F);//Float 출력
		dos.writeDouble(3.14159); //Double 출력
		dos.writeUTF("안녕하세요."); //String 출력 
		System.out.println("출력완료<==외부파일에 저장");
		// 위아래 형식이 같아야 출력이 됨.
		System.out.println("========인풋해서 출력========");
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}
}

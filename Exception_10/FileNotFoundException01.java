package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;
public class FileNotFoundException01 {

	public static void main(String[] args) { //FileNotFoundException : 파일의 경로를 찾을 수 없을 경우 예외 
		
		
		FileInputStream fis = null; //파일에서 값을 읽어오는 스트림
		
		try {
		fis = new FileInputStream ("a.txt") ;
		}
		catch (FileNotFoundException e) { 
			System.out.println(e);	//오류정보를 출력 
			System.out.println("예외발생함");
		}
		System.out.println("프로그램 정상 종료");
	}
}

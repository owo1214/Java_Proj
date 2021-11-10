package Exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling04 {

	public static void main(String[] args) {	//여러개의 exception 처리 
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("e.txt");
		} catch (FileNotFoundException e) {	//try {} 블락에서 예외가 발생시 catch{} 블락이 작동
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("catch 블락 작동");
			return;
		}
		finally { //try {} 블락이 실행되면 finally{}은 반드시 실행 (예외 발생과 상관없이 작동)
			System.out.println("finally 블락 실행");
		}
			//if (fis !=null) {
				try {
					fis.close(); //객체를 메모리에서 제거 (예외처리를 해야한다.)
					System.out.println("객체 정상 메모리에서 제거");
				} catch (IOException | NullPointerException e) {
					System.out.println("객체 정상 메모리에서 제거 안됨(Null)");
					//e.printStackTrace();
				}
			//}
				System.out.println("프로그램 종료"); 
	}

}

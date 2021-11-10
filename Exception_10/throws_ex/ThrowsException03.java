package Exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;	//동적로딩 : 실행시에 확인 Class.forName()

public class ThrowsException03 {	//throws : 예외를 미루는 것, 호출하는 곳에서 처리를 해야함. 
	
	public Class loadClass (String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);	//클래스의 전체 이름을 받아서 존재하는지  확인
		return c;	//Class.forName (전체클래스) : 동적 로딩이 지원 
					//동적로딩- 컴파일시에 이름을 확인 하는것이 아니라 실행시 이름 확인 하는것.
	}
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
	/*	
		try {	//Multi catch : 두개의 exception에 대해서 하나로 처리 
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	 */
		
		try { //Surround catch : 각각의 exception에 대해서 각각 처리 
			Class d = test.loadClass("C:\\test\\c.txt", "java.lang.String");
			System.out.println(d.getClass());
				d.getClass();
				
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("파일이 없습니다.");
			
		} catch (ClassNotFoundException e) {	//동적 로딩이 적용 되어서 나중에 확인 함 
			System.out.println(e);
			System.out.println("클래스 파일이 없습니다.");
			
		} catch (Exception e) { //그 외에 모든 exception을 처리한다 <<최상위의 Exception>>
			System.out.println(e);
			
		}
		System.out.println("프로그램 종료");
		
		
		
	}
}

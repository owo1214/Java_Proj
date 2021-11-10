package stream_19.other;

import java.io.Console;

public class ConsoleTest {	//명령프롬프트 에서 입력을 받도록 함. 명령프롬프트에서 실행
							//JVM 1.8 까지만 작동
			//출력시 주의할점.
			//컴파일된 bin 폴더에서 명령어를 실행
			//java 전체패키지이름.패키지이름.클래스이름(뒤에 확장자명X) 
								//예) stream_19.other.ConsoleTest

	public static void main(String[] args) {
		Console console =System.console(); //java.io.Console - 인스턴스 변수 생성 
		
		System.out.println("이름을 입력 하세요.");
		String name = console.readLine(); //
		System.out.println("직업을 입력 하세요.");
		String job = console.readLine();
		System.out.println("비밀 번호를 입력 하세요.");
		char[] pass = console.readPassword();	//readPassword(): 
		String strPass = new String(pass);		//pass 배열의 값을 string형으로 변환
		
		System.out.println("========출력 결과========");		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
	}
}

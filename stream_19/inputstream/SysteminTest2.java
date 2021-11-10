package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 작성하고 [Enter]를 누르세요");
		
		int i ;
		
		try {
			
										  // '\n' 값은 13 <enter> 
			while ((i = System.in.read()) != '\n') { //Enter를 넣으면 While문을 빠져나온다.
				System.out.println((char)i);
			}
		
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
		System.out.println();
		
	}
}

package stream_19.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {	//문자 스트림 : 문자를 처리해 주는 스트림

	public static void main(String[] args) throws IOException {
		
		//FileWriter: 외부 파일이 존재하지 않을 경우 생성, 쓰기
		//FileReader: 외부 파일이 존재하지 않는 경우 : NotFoundException
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); //문자 1자를 처리. 문자 1자를 처리할때 'A'
		//배열의 값을 한꺼번에 저장,출력
		char [] buf = {'B','C','D','E','F','G'};
		fw.write(buf);	//배열의 값을 출력, 외부 파일에 저장 
		fw.write("안녕하세요. 자바 프로그램 시간입니다.");
		
		fw.write(buf,1,2);	//배열의 일부 값을 출력
		fw.write("65");		//숫자를 그대로 출력
		
		fw.close();
		System.out.println("정상적으로 출력 되었습니다.");
	}
}

package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			int i;
			while ((i=fis.read(bs)) != -1) {
				
				//향상된 for문 : 마지막값을 자른 경우 뒤에 값이 붙어올 수 있다.
				/*
				System.out.println("향상된 for 문을 사용해서 출력");
				for (byte b: bs) {
					System.out.print((char) b);
				}
				*/
				System.out.println();
				
				System.out.println("for 문을 사용해서 출력");
				for (int k=0; k<i; k++) {
					System.out.print((char)bs[k]); 
				}
				
				System.out.println(" : " + i+ "바이트 읽음.");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
	}
}

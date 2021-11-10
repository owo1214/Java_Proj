package baekjoon.chap2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		scanner.close();
		
		if(x > 0 && y > 0) {		//x,y 가 모두 양수
			System.out.println(1);
		} else if(x < 0 && y > 0) {	//x가 음수 y가 양수
			System.out.println(2);
		} else if(x < 0 && y < 0 ) {//x가 음수 y가 음수
			System.out.println(3);
		} else if(x > 0 && y < 0 ) {//x가 양수 y가 음수
			System.out.println(4);
		}
	}
}

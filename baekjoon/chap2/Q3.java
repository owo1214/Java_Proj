package baekjoon.chap2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //주어진 조건에 하나만 충족하면 ||(or) 사용
			System.out.println(1); //윤년O
		} else {
			System.out.println(0); //윤년X
		}
	}
}

package baekjoon.chap2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);	
		
		int score = scanner.nextInt();
		
		if(score >= 90 && score <= 100) { //주어진 조건이 모두 맞아야할 때 && 사용
			System.out.println("A");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		scanner.close();
	}
}

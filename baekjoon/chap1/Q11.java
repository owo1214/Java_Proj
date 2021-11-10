package baekjoon.chap1;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);
		int a = scanner.nextInt();	//472
		int b = scanner.nextInt();	//385
		scanner.close();
//		System.out.println(a);
//		System.out.println(b);
		
		int b1 = b % 10; 
		int b2 = (b / 10) % 10;
		int b3 = (b /100);
		
//		System.out.println(b1); //5
//		System.out.println(b2); //8
//		System.out.println(b3); //3
		
		System.out.println(a * b1);	//2360
		System.out.println(a * b2);	//3776
		System.out.println(a * b3);	//1416
		System.out.println((a*b1)+(a*b2*10)+(a*b3*100)); //181720
	}
}

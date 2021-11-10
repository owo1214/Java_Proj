package ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류, 배열에 저장 
		int money; // 인풋 받는 돈의 액수 
		System.out.println("금액을 입력하세요. >>>");
		money =sc.nextInt();
		
		for (int i=0; i<unit.length; i++) {
			
			System.out.printf(" %d 원 짜리 : %d 개 \n" ,unit[i],money/unit[i]);
			money = money - (money / unit[i]) *unit[i] ; 
			// 총 가진 돈에서 환산한 돈을 다시 돈에 저장하고 , 다음 배열에서 다시 환산해서 다시 돈에 저장한다.
		}
		
		sc.close(); //scanner 는 사용후 제거 
	}

}

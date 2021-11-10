package Minhye;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		//배열 방의 수를 입력 받아 배열의 크기를 생성하고,
		//각 방에 정수를 넣어서 입력하고,
		//각 방의 내용을 향상된 (enhanced For문)으로 출력하고 , 평균을 츌력해보세요.
		
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int [5];
		int max = 0;
		double sum = 0;
		
		System.out.println("정수를 입력 해주세요.");
		for (int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		for (int arr: intArray ) {
			sum += arr;
		}
		
		System.out.println("점수 총합: " +sum);
	
		double avg= (double) sum / intArray.length;
		System.out.println("점수 평균: " +avg);
		
		scanner.close();
				
			
		
	}
}

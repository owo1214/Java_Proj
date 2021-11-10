package ex;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[]; //배열
		int num; //배열의 방의 갯수 
		int sum =0;
		
		System.out.println("정수 몇개를 사용 할 까요? ");
		num = sc.nextInt();
		
		arr = new int [num]; // 스캐너에서 인풋 받은 변수 값을 배열 방크기로 설정
		
		for (int i=0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()* 10 + 1); //각 방에 랜덤한 정수값을 저장 (1~10)
			sum += arr[i];  //sum= sum+ arr[i]
		}
		for (int s :arr) {
			System.out.printf(s + " ");
		}
		
		double avg = (double) sum/arr.length; //평균은 반드시 실수로 출력 
		
		System.out.println("총 합은 :" + sum + "이고, 평균은 : "+avg);
	}
}

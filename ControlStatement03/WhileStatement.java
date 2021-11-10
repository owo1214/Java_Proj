package ControlStatement03;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
		/*
		 * while문]
		 * 반복의 수가 정해져 있지 않을때 주로 사용
		 * 
		 * 형식]
		 * [초기식;]
		 * while(반복조건식) {
		 * 	수행문;
		 * 	[증감식;]
		 * 	...
		 * }
		 * 
		 * -조건식은 비교식 내지 논리식이어야 한다.
		 * -조건식이 참일 동안 반복수행
		 * -초기식은 반드시 초기화해야된다.
		 * 
		 * 무한반복
		 * while(true){
		 * 	수행문;
		 * }
		 * 
		 */
		//1에서 10까지 누적합
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1에서 10까지 누적합:"+sum);
		System.out.println("while문이 끝난후 i:"+i);

		/*
		 * 문]1부터 1000까지 숫자중 3의 배수이거나 5의 배수인
		 * 숫자의 합을 구해라
		 * 단, 3과 5의 공배수인 경우 제외 (while문 사용)
		 */
		
		i=1;
		sum=0;
		while(i<=1000) {
			if ((i%3==0 || i%5==0) && (i%15!=0)) sum+=i;
			i++;
		}
		System.out.println("1부터 1000까지 숫자중 3의 배수이거나 5의 배수의합(공배수제외):"+sum);
		
		/* 방법2
		i=1;
		sum=0;
		while(i<=1000) {
			if (i%3==0 ^ i%5==0) sum+=i;
			i++;
		}
		System.out.println("1부터 1000까지 숫자중 3의 배수이거나 5의 배수의합(공배수제외):"+sum);
		 */
		
		System.out.println("문자열을 입력하세요.");
		char word;
		//사용자가 몇 자를 입력할지 모름으로 while문 사용 (for문도 사용가능)
		while((word=(char)System.in.read()) !=13) {
			System.out.println(word);
		}///while
		System.out.printf("%n");
		
		/*문]
		 * 
		 * 1 0 0 0 (1,1)
		 * 0 1 0 0 (2,2)
		 * 0 0 1 0 (3,3)
		 * 0 0 0 1 (4,4) 처럼 출력해보자
		 */
		
		int j=0;
		while(j<=4) { //j행번호
			 int k=0;
			 while (k<=4) { //k열번호
				 if(j==k) System.out.printf("%-2d",1);
				 else System.out.printf("%-2d",0);
				 k++;
			 }
			 System.out.printf("%n");
			 j++;
		}
		
		/*문]
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * * 를 출력하여라 (이중 while문 이용)
		 * 
		 */
		 
		j=1;
		while (j<=5) {
			int k=1;
			while(k<=5) { 
				if(j>=k) System.out.printf("%2c",'*'); 
				k++;
			}
			System.out.println();
			j++;
		}
		
		/*문]
		 * * * * *
		   * * * *
		     * * *
		       * *
		         * 를 출력하여라 (이중 while문 이용)
		         
		 */
		System.out.println("[* 출력]");
		j=1;
		while (j<=5) {
			int k=1;
			while(k<=5) { 
				if(j<=k) System.out.printf("%2c",'*');
				else System.out.printf("%2c",' ');
				k++;
			}
			System.out.println();
			j++;
		}
		
		/*
		 * 문]아래 형식대로 구구단을 출력
		 * 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4...........9 * 1 = 9
		 * 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8...........9 * 2 = 18
		 * ..
		 * ..
		 * ..
		 *  2 * 9 = 18 3 * 9 = 27 4 * 9 = 36...........9 * 9 = 81
		 *  
		 *  단, while문 사용
		 */
		System.out.println("[구구단 출력]");
		
		int z=2;
		while (z<=9) {
			int x=1;
			while (x<=9) {
				System.out.printf("%d * %d = %-3d",z,x,z*x);
				x++;
			}
			System.out.println();
			z++;
		}
		
	}//main

}//class

package Minhye.Book;

import java.util.Scanner;

public class P182_9 {
	
	public static void main(String[] args) {
		boolean run =true;
		int studentNum=0;
		int[] scores= null;
		Scanner sc= new Scanner (System.in);
		
		
		while(run){
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo ==1) { //학생수를 입력 받고 , 배열의 크기를 입력 받은 학생수로 지정
				System.out.println("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			
				
			} else if (selectNo ==2) { // 각각의 배열 방에 학생들의 점수를 입력 
				for( int i =0; i<studentNum; i++) {
					System.out.println("scores[" +i +"] >");
					scores[i]=sc.nextInt();
				}
			} else if (selectNo ==3) {
				for( int i =0; i<studentNum; i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
				
			} else if (selectNo ==4) {
				int x=0;
				int c=0;
				for(int i =0; i<studentNum; i++) {
					if(scores[i]>x) x=scores[i];
					c+=scores[i];
				}
				System.out.println("최고점수: " +x);
				System.out.println("평균점수: "+ (double)c/studentNum);
				
			} else if (selectNo ==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}

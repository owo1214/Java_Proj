package Minhye.chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public int score;
	public Student(int score) {
		this.score = score;
	}
	
	public static void main(String[] args) {
		boolean run =true;
		int studentNum=0;
		int[] scores= null;
		Scanner scanner=new Scanner(System.in);
		ArrayList<Student> student=new ArrayList<Student>();
		
		while(run){
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) { //학생수를 입력 받고 , 배열의 크기를 입력 받은 학생수로 지정
				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
			
				
			} else if (selectNo ==2) { // 각각의 배열 방에 학생들의 점수를 입력 
				for( int i =0; i<studentNum; i++) {
					System.out.println("scores[" +i +"] >");
					student.add(new Student(scanner.nextInt()));
				}
			} else if (selectNo ==3) {
				for( int i =0; i<studentNum; i++) {
					System.out.println("scores["+i+"]:"+student.get(i).score);
				}
				
			} else if (selectNo ==4) {
				int max=0;
				int sum=0;
				for(int i =0; i<studentNum; i++) {
					if(student.get(i).score>max) max=student.get(i).score;
					sum+=student.get(i).score;
				}
				System.out.println("최고점수: " +max);
				System.out.println("평균점수: "+ (double)sum/studentNum);
				
			} else if (selectNo ==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}

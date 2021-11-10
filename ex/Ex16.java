package ex;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
	
		/*
		Scanner scan = new Scanner(System.in);

		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
	    String name;
	    int i,flag;
	    while (true ) {
	    	flag = 0;
	    	System.out.println("과목이름: ");
	    	name =scan.next();
	    	if(name.equals("그만"))
	    		break;
	    	for(i=0;i<course.length;i++) {
	    		if(course[i].equals(name)) {
	    			System.out.println(name +"의 점수는 " +score[i]);
	    			flag = 1;
	    		}
	    	}
	    	if(flag == 0)
	    		System.out.println("없는 과목입니다.");
	    }
		*/
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		String name = "";  // 스캐너에서 입력을 받도록 하는 변수
		int i =0;
		
		while (true) {
		 System.out.println("과목 이름을 입력 하세요. >> ");
		 name = sc.next();	//문자열을 인풋 받을때 next(); 메소드 사용.
		 if (name.equals("그만")) break; //breakf; 를 만나면 while 문을 빠져나온다 .
		 for (i= 0; i<course.length; i++) {
			 if(course[i].equals(name)) {
				 System.out.println(course[i] + "의 점수는" + score[i]+ "입니다.");
				 break;
			 }
		 }
		 if (i== course.length) {
			 System.out.println("없는 과목 입니다.");
		 }
		}
		System.out.println("while 믄을 빠져 나왔습니다.");
		sc.close();
		
		
		
		
		
		
	}
}

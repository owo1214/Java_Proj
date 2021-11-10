package Minhye;

import java.util.Scanner;

public class MinhyeNote {

	public static void main(String[] args) {
	
	/*	
	int sum=0;
	for(int i=1; i<=100; i++) {
		sum += i;
	}
	System.out.println("1부터 100까지의 합: " +sum);
	
	for(int k=1; k<=4; k++)
	{
		for(int j=1; j<=k; j++)
		{
			System.out.print("*");
		}
		System.out.println();	
	}
	
	*/
		
		
	
	/*
	int[] scores = {1,2,3,4,5,6,7,8,9,10};
	int sum1=0;
	for(int s=0;s<scores.length;s++) {
		sum1 += scores[s];
	}
	System.out.println("1~10까지의 합: " +sum1);	
	
	*/
	
	/*
	int max = 0;
	int[] array = {4,5,1,2,3};
	
	for(int a=0;a<array.length;a++) {
		if(max<array[a]) {
			max =array[a];
		}
	}
	System.out.println("최대값 : " +max );
	*/
	
	
	
	/*	
	int[] arr = new int[10];
	Scanner sc = new Scanner(System.in);
	

	for(int b=0;b<10;b++) {
		System.out.println("양의 정수 10개를 입력 하시오>>");
		arr[b] = sc.nextInt();
	}
	
    System.out.print("3의 배수는 ");
    for(int b=0; b<10; b++) {
       if(arr[b] % 3 == 0) {
          System.out.print(arr[b]+ " ");
		}
	}
   */ 
	
	/*
    Scanner scanner= new Scanner(System.in);
    int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    System.out.println("금액을 입력하세요.");
    int money = scanner.nextInt();
    
    for(int c=0;c<8;c++) {
    	System.out.println(unit[c]+"원" + money/ unit[c]);
    	money -= unit[c] * (money/ unit[c]);
    }
    */
	
		
	/*	
	int arr[]=new int[10];
	int num1=0;
	
	System.out.print("랜덤한 정수들 : ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(Math.random()*10+1);
		System.out.print(arr[i]+" ");
		num1+=arr[i];
	}
	System.out.println();
	
	System.out.print("평균은 "+((double)num1/arr.length));
	*/
	
	
	
	
	
	
/*	
	for (int i= 3; i<100; i++) {
		int num = i%10;
		int ten = i/10;
		if (i<10) {
			if (i%3==0)
				System.out.println(i + "박수 짝");
		} else {
			if ((ten%3==0)&&(i%10==0))
				System.out.println(i + "박수 짝");
			else if ((num%3==0)&&(ten%3==0))
				System.out.println(i + "박수 짝짝");
			else if ((num%3==0)||(ten%3==0))
				if (i%10 !=0)
					System.out.println(i+"박수 짝");
		}
	}
*/
	
		
		
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
	
	/*	Scanner scan = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			int i= (int)(Math.random()*3);
			System.out.println("가위 바위 보 !");
			String play = scan.next();
			if(play.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		System.out.println("사용자는 "+play + "컴퓨터 = "+ str[i]+ ",");
		if (play.equals("가위")) {
			if(str[i].equals("가위"))
			System.out.println("비겼습니다.");
			else if(str[i].equals("바위"))
			System.out.println("컴퓨터가 이겼습니다.");
			else if(str[i].equals("보"))
			System.out.println("사용자가 이겼습니다.");
			}
			else if (play.equals("바위")) {
			if(str[i].equals("가위"))
			System.out.println("사용자가 이겼습니다.");
			else if(str[i].equals("바위"))
			System.out.println("비겼습니다.");
			else if(str[i].equals("보"))
			System.out.println("컴퓨터가 이겼습니다.");
			}
			else if (play.equals("보")) {
			if(str[i].equals("가위"))
			System.out.println("컴퓨터가 이겼습니다.");
			else if(str[i].equals("바위"))
			System.out.println("사용자가 이겼습니다.");
			else if(str[i].equals("보"))
			System.out.println("비겼습니다.");
			}
			else
			System.out.println("잘못 입력하셨습니다.");
			}*/

		
		
	
    
	} ///main
} ///class

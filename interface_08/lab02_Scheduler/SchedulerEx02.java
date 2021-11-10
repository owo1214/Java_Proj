package interface_08.lab02_Scheduler;

import java.util.Scanner;

public class SchedulerEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		
		while (run) {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선 순위가 가장 높은 고객에게 할당");
		System.out.println("위의 문자를 넣으세요 >> ");
		
		String ch= sc.next();
		if (ch.equals("그만")) {break;}
		Scheduler scheduler = null;	//Scheduler 객체 선언
		
		if(ch.equals("R")|| ch.equals("r")) {			//ch 변수의 값이 R,r 이면 
			scheduler = new RoundRobin();	//scheduler 인트턴스 변수에 RoundRobin() 객체를 할당
		}
		
		else if(ch.equals("L") || ch.equals("l")) {
			scheduler = new LeastJob();
		}
		
		else if(ch.equals("P") || ch.equals("p")) {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();	//메소드호출
		scheduler.sendCallToAgent();
		
		System.out.println();
		System.out.println("==========================================");
		
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}

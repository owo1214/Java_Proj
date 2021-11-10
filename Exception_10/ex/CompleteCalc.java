package Exception_10.ex;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc {
	int a;
	int b;
	public CompleteCalc (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int times(int a, int b) {
		return a*b;
	}

	@Override
	int substract(int a, int b) {
		return a-b;
	}


	@Override
	int divide(int a, int b) {
		return a/b;
	}
	
	@Override
	public String toString() {
		return "합은: " + add(a,b) + ", 뺀값: "+ substract(a,b)+", 곱한값: " +times(a,b)+
				", 나눈값: "+ divide(a,b);
	}
	
	
	public static void main(String[] args) {
		//Calc 인터페이스를 구현, Calculator 추상 클래스를 구현 합니다.
		//스캐너로 두개의 정수를 인풋받아서 .객체 자체를 print 했을때, 4칙연산이 모두출력
		// a /b : b가 0인경우 Exception 발생 ArithmeticException
		
		Scanner sc =new Scanner(System.in);
		int a;
		int b;
		System.out.println("변수 a 값을 넣으세요> ");
		a =sc.nextInt();
		System.out.println("변수 b 값을 넣으세요>");
		b =sc.nextInt();
		
		CompleteCalc calc = new CompleteCalc(a,b);
		 System.out.println(calc.add(a, b));
		 System.out.println(calc.substract(a, b));
		 System.out.println(calc.times(a, b));
		
		try {
			System.out.println(calc);
			
		} 
		catch (ArithmeticException e) {
			
		} 
		
		System.out.println("프로그램 종료");
		
		
		/*
		int a = 10;
		int b = 5;
		
		int c = a / b ;
		
		System.out.println(c);
		*/
		
	}

	

}

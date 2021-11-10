package lamda_14.lamda.lab02;

import java.util.Scanner;

public class ArithmeticOperationTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("첫번째 값을 넣으세요 > ");
		double a = sc.nextDouble();
		//int a = sc.nextInt();
		System.out.println("두번째 값을 넣으세요 > ");
		double b = sc.nextDouble();
		//int b = sc.nextInt();
		
		try {
		System.out.println("1. 객체 지향으로 출력 하기");
		ArithmeticOperationComp comp01 = new ArithmeticOperationComp();
		comp01.ArithmeticOper(a, b);
			
		
		System.out.println("2. 람다식 출력 하기");
		ArithmeticOperation comp02 = (x,y) -> System.out.println("a + b = " + (x + y));
		ArithmeticOperation comp03 = (x,y) -> System.out.println("a - b = " + (x - y));
		ArithmeticOperation comp04 = (x,y) -> System.out.println("a * b = " + (x * y));
		ArithmeticOperation comp05 = (x,y) -> System.out.println("a / b = " + (x / y));
		
		comp02.ArithmeticOper(a, b);
		comp03.ArithmeticOper(a, b);
		comp04.ArithmeticOper(a, b);
		comp05.ArithmeticOper(a, b);
		
		
		System.out.println("3. 익명 내부 객체로 출력 하기");
		ArithmeticOperation comp06 = new ArithmeticOperation() {
			
			@Override
			public void ArithmeticOper(double a, double b) {
				System.out.println("a + b = " + (a+b));
				System.out.println("a - b = " + (a-b));
				System.out.println("a * b = " + (a*b));
				System.out.println("a / b = " + (a/b));				
			}
		};
		comp06.ArithmeticOper(a, b);
		
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
		
		sc.close();
		
	}

}

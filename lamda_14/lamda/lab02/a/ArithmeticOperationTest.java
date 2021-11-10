package lamda_14.lamda.lab02.a;

import java.util.Scanner;

public class ArithmeticOperationTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 인수를 입력 하세요. > ");
		double a = sc.nextDouble();
		
		System.out.println("두번째 인수를 입력 하세요. > ");
		double b = sc.nextDouble();
		
		try {
		System.out.println("1. 객체 지향으로 출력");
		ArithmeticOperationCompl arith01 = new ArithmeticOperationCompl();
		arith01.arithmeticOper(a, b);
		
		System.out.println("2. 람다식을 이용하여 출력");
		ArithmeticOperation arith02 = (x,y) -> System.out.println("a + b = " + (x + y));
		ArithmeticOperation arith03 = (x,y) -> System.out.println("a - b = " + (x - y));
		ArithmeticOperation arith04 = (x,y) -> System.out.println("a * b = " + (x * y));
		ArithmeticOperation arith05 = (x,y) -> System.out.println("a / b = " + (x / y));
		
		arith02.arithmeticOper(a, b);
		arith03.arithmeticOper(a, b);
		arith04.arithmeticOper(a, b);
		arith05.arithmeticOper(a, b);
		
		System.out.println("3. 익명 내부 클래스를 이용하여 출력");
		ArithmeticOperation arith06 = new ArithmeticOperation() {
			
			@Override
			public void arithmeticOper(double a, double b) {
				System.out.println("a + b = " + (a + b));
				System.out.println("a - b = " + (a - b));
				System.out.println("a * b = " + (a * b));
				System.out.println("a / b = " + (a / b));
			}
		};
		arith06.arithmeticOper(a, b);
		
		int c = 10;
		int d = 0;
		
		System.out.println(c/d);
		
		}
		
		catch ( ArithmeticException e) {
			System.out.println(e);
			
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}

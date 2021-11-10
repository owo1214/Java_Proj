package lamda_14.lamda.lab02.a;

public class ArithmeticOperationCompl implements ArithmeticOperation {

	@Override
	public void arithmeticOper(double a, double b) {
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));	
	}

}

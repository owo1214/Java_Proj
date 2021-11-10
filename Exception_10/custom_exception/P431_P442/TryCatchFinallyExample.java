package Exception_10.custom_exception.P431_P442;

public class TryCatchFinallyExample {	//431-01

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}

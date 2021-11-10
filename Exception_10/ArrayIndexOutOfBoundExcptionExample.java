package Exception_10;

public class ArrayIndexOutOfBoundExcptionExample {
	public static void main(String[] args) {
		//run configurtions 
		
		try {
			String date1 = args[0];
			String date2 = args[1];
		
			System.out.println("atgs[0] :" + date1);
			System.out.println("atgs[1] :" + date2);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("catch 작동");
		}
		System.out.println("프로그램 종료");
		
		
	}
}

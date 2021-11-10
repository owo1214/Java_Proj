package ex;

public class Random {

	public static void main(String[] args) {
		
		
		
		int n = (int)( Math.random() * 3 ); // 0 , 1 , 2 값만 출력이 된다.
		System.out.println(n);
		
		System.out.println("==========================");
		System.out.println(Math.random()); // 0.0xxxxxxxxxxxxx ~ 0.9xxxxxxxxxxxxx
		System.out.println(Math.random() * 10 ); // 0.xxxxxxxxxxx ~ 9.xxxxxxxxxx
		System.out.println((int) Math.random() * 10); // 0 ~ 9
		System.out.println((int) Math.random() * 10 + 1); // 1 ~ 10 까지의 랜덤한 값을 출력
		System.out.println((int) Math.random() * 100 + 1); // 1 ~ 100 까지
		
	}

}

package lamda_14.inner_class;

class Outer2 {
	/*
	 * 익명 (내부) 클래스 : 클래스 이름이 없는 클래스
	 */
	
	Runnable getRunnable(int i) { //익명 내부 클래스 , 메소드 내에서 클래스 이름이 생략된 내부 클래스
		int num=100;
		return new Runnable() {
			
			@Override
			public void run () {
				
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner =  new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수 ");
		}
	};	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
			
			Runnable runnable = out.getRunnable(10);
			runnable.run();
			
			out.runner.run();
	}

}

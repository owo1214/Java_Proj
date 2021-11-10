package Exception_10;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) { //try에서 예외가 발생하지 않을 경우 catch 블락이 작동되지않는다. 
		int[] arr = new int[5];
				
				
		try {
			for(int i=0; i<5; i++) {
				arr[i] = i; // 각방에 값을 추가
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); 	//오류코드를 출력해라
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 정상 종료");
		
	
	}

}

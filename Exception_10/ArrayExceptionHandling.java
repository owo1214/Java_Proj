package Exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];	//배열의 방 5개 생성
		
		for(int i=0; i<=5; i++) {	//Exception이 발생  배열의 방번호를 넘겨버림
				//ArrayIndexOutOfBoundsException : 배열의 방번호를 넘겼을때 
			arr[i] = i ;
			System.out.println(arr[i]);
		}
		System.out.println("프로그램 정상 종료 ");
	}

}

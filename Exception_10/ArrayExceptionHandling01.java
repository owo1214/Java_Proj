package Exception_10;

public class ArrayExceptionHandling01 {

	public static void main(String[] args) {	//try에서 예외가 발생할 경우 catch 블락이 작동됨 
		int[] arr = new int[5];
		
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i] = i; // 각방에 값을 추가
				System.out.println(arr[i]);
			}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e); 	//오류코드를 출력해라
		System.out.println("예외 처리 부분");
	}
	System.out.println("프로그램 정상 종료");

	}//예외가 발생되지 않으면  catch이 발동되지 않는다. 예외가 있을시에만 작동됨.
}

/*
try {
	//예외가 발생될 부분
} catch(예외의 오류코드 e){
	//예외 처리할 부분 , try내에서 예외가 발생이 되면 작동
}
*/
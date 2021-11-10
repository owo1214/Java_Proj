package basic_class_11.object;

public class String_Ex02 {

	public static void main(String[] args) {
		String javaStr =new String("자바");
		String androidStr =new String("안드로이드");
			
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); //concat() : 두개의 문자열을 연결해서 출력하는 메소드
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
		
	}
}

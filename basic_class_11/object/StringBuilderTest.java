package basic_class_11.object;

public class StringBuilderTest {

	public static void main(String[] args) { //StringBuilder 단일스레드 환경에서 대량으로 문자열 연결할때 사용
		String javaStr =new String("자바");
		System.out.println("JavaStr 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder (javaStr);
		System.out.println("연산전 buffer 메모리 주소: " +System.identityHashCode(buffer));
		
		buffer.append("and");
		buffer.append("android");
		buffer.append("program is fun!!");
	
		System.out.println("연산후 buffer 메모리 주소: " +System.identityHashCode(buffer));
		
		javaStr = buffer.toString();	//buffer  의 문자열 연결한 값을 javaStr에 할당
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 값: " + System.identityHashCode(javaStr));
	}
}

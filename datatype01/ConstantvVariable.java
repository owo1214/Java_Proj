package datatype01;

/*
 * 상수:저장된 값이 절대 변하지 않는 메모리의 한 종류
 * 선언방법:final 자료형 변수형= 초기값;
 * 변수명(상수명)은 보통 대문자로 선언한다.
 * 상수는 프로그램의 가독성을 높이며 유지 보수에도 유리하다.
 */
public class ConstantvVariable {
	//클래스안]
	//final double PI;[x] //초기화를 안해서
	//반드시 초기화를 해야된다.
	//final double PI=3.14;
	static final double PI = 3.14;
	//프로그램의 가독성을 높이기 위한 상수 선언
	static final int SCISSORS = 1; //
	static final int ROCK = 2;
	static final int PAPER = 3;
	
	public static void main(String[] args) {
		double d1 = PI;
		//PI = 3.145;//[x] //상수는 변할 수 없는 없는 값
		
		
		final String NICK_NAME; //지역상수
	    /*메소드(즉 지역)안에서 상수를 선언할떄는 초기화를 사용전에만 해주면 된다.
	     * 보통 메스드(지역)안에서는 상수 선언을 안함
	     * 주로 클래스안에서 상수 선언 함.
	     */
	   //System.out.println(NICK_NAME);//[x] //초기화 안해서
	    NICK_NAME = "자바";
	    System.out.println(NICK_NAME);
	    
	    //NICK_NAME = "오라클";[x] //변경불가
	    
	    //가독성
	    int computer=1, user=2; //가독성이 떨어진다.
	    
	    computer=SCISSORS;
	    user=ROCK;
	    System.out.println("가독성이 높다");
	    
	    
	}
	public static void test( ) {
		double d1 = PI;
	}
}

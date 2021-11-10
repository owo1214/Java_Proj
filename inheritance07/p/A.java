package inheritance07.p;

public class A {
	private int pri;		//private 접근 제한자 : 클래스 내에서만 호출해서 사용 할 수 있음.
	int def;				//[default] 접근 제한자 : 같은 패키지 내에서 호출해서 사용 할 수 있음.
	protected int pro;		//protected 접근 제한자 : 상속된 다른 패키지에서 호출해서 사용 할 수 있음.
	public int pub;			//public 접근 제한자 : 다른 패키지에서 호출해서 사용 할 수 있음.
	
	//pri = 4;  //외부에서 변수값을 넣으면 오류남 
	public void setA () {
		pri = 5;
	}


}



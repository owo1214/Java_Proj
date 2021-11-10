package basic_class_11.garbag_collector;

public class Counter {
	//garbag  collector  (가비지 컬랙터 ) : 메모리의 쓰레기 (사용하지 않는 객체 ) 청소 . system.gc();
	//java 는 가비지를 jvm이 자동으로 청소해준다. cpu 유효할때
	//finalize() 메소드: 가비지 컬렉터가 청소하기전에 호출되는 메소드
		//객체 소멸직전에 호출되는 메소드
		//객체 소멸자 (가비지 컬렉터)는 객체를 소멸 하기 직전 finalize () 메소드를 호출 
	private int no;
	public Counter(int no) {
		this.no= no;
	}
	@Override
	protected void finalize() throws Throwable {	//객체가 삭제 될때 홏출
		System.out.println(no + "번째 finalize() 가 실행됨 (객체 소멸됨)");
	}

}

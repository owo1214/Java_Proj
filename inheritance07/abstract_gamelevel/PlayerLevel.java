package inheritance07.abstract_gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();		//달린다. 레벨에 따라 다르게 달린다
	public abstract void jump();	//점프 레벨에 따라 다르게 점프한다.
	public abstract void turn();	//방향 전환을 레벨에 따라 다르게 전환
	public abstract void showLevelMassage();//레벨의 정보를 출력
	
	final public void go(int count) {	//템플릿 메소드 : 로직을 구현, 오버라이딩 블가
		    run();
		    for (int i=0; i<count; i++) {
		    	jump();
		    }
		    turn();
		    
		    
		    
		    
		    
	}
}

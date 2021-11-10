package inheritance07.abstract_gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 아주 높이 Jamp 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 Turn 합니다.");
		
	}

	@Override
	public void showLevelMassage() {
		System.out.println("=======고급자 레벨입니다=======");
		
	}

}

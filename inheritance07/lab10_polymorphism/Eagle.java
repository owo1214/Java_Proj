package inheritance07.lab10_polymorphism;

public class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리는 하늘을 나릅니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘을 훨훨 높이 나릅니다.");
	}
}

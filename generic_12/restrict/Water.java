package generic_12.restrict;

public class Water extends Material {
	
	public void doPrinting() {
		System.out.println("물 재료를 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 물입니다.";
	}
	
}

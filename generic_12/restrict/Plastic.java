package generic_12.restrict;

public class Plastic extends Material { //material을 상속한 재료만 제너릭에서 사용
	
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료를 출력 합니다.");
	}

	@Override
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
	
}

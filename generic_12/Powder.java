package generic_12;

public class Powder {
	//GenericPrint 에 들어갈 재료 (파우더)
	
	public void doPrinting() {
		System.out.println("파우더 재료를 출력 합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 powder 입니다.";
	}
}

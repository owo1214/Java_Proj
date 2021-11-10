package generic_12;

public class GenericPrinter<T> {	//다양한 재료를 사용하는 프린터 (지능적인 프린터)
								//다양한 객체 데이터 타입을 받아서 처리
								//프린터 재료 (파우더, 플라스틱...)
	
	private T material;	//인스턴스(객체) 변수
	
	public void setMaterial (T material) {	//setter - material 변수에 값을 할당
		this.material = material;
	}
	
	public T getMaterial() {	//getter - material 변수에 값을 돌려줌
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	public void printing() {
		//material.doPrinting();
	}
	
}

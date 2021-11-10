package generic_12.restrict;

public class GenericPrinter<T extends Material> {	
	//extends Material  데이터 타입의 접근제한.
								
	
	private T material;	
	
	public void setMaterial (T material) {	
		this.material = material;
	}
	
	public T getMaterial() {	
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
	
}

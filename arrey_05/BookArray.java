package arrey_05;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library=new Book[5]; // 객체 배열 생성, 값을 할당 하지 않은면 기본값으로 null
		
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

	}

}

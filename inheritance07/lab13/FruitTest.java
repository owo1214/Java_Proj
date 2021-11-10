package inheritance07.lab13;
/*
과일 객체를 만드세요. * 부모 객체 
-과일 이름 name
-과일 색깔 color
-과일 크기 size


사과 - 과일 객체를 상속  
오렌지 - 과일 객체를 상속  
바나나 - 과일 객체를 상속 

객체를 메소드 오버라이딩 사용 ArrayList 객체 저장 
향상된 for문을 사용 과일이름 과일색깔 과일크기를 출력해보세요 
*/
import java.util.ArrayList;

class Fruit{ //부모 클래스
	String fruitName;	//변수의 초기값을 할당 : 1. 생성자 2.setter 3. 객체에서 변수값을 할당
	String color;
	int large;
	
	Fruit(){}
	public  Fruit (String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
		
	}
	public String showInfo() {
		return "과일의 내용을 출력합니다.";
	}
}
///////////////////////////////////////////////////////////////////////////
class Apple extends Fruit{
	public Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "과일이름은 " + fruitName + "이고, 과일색깔은 " + color + "이고, 과일크기는 " +
				large + "입니다." ;
	}
	public void app() {
		System.out.println("다운 캐스팅으로 사과를 출력합니다.");
	}
///////////////////////////////////////////////////////////////////////////
}
class Orange extends Fruit{
	public Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "과일이름은 " + fruitName + "이고, 과일색깔은 " + color + "이고, 과일크기는 " +
				large + "입니다." ;
	}
	public void org() {
		System.out.println("다운 캐스팅으로 오렌지를 출력합니다.");
	}
}
///////////////////////////////////////////////////////////////////////////
class Banana extends Fruit{
	public Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "과일이름은 " + fruitName + "이고, 과일색깔은 " + color + "이고, 과일크기는 " +
				large + "입니다." ;
	}
	public void bana() {
		System.out.println("다운 캐스팅으로 바나나를 출력합니다.");
	}
	
}

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		Fruit apple = new Apple ("사과","빨강",10);			//업캐스팅
		Fruit orange = new Orange ("오렌지","주황",20);		//업캐스팅
		Fruit banana = new Banana ("바나나","노랑",30);		//업캐스팅
		 
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for (Fruit f : fruitList) {
			System.out.println(f.showInfo());
		}
		System.out.println("=========다운캐스팅으로==========");
		Apple a = (Apple) apple; //다운캐스팅
		a.app();
		Orange o = (Orange) orange; //다운캐스팅
		o.org();
		Banana b = (Banana) banana; //다운캐스팅
		b.bana();
		System.out.println("=========ArrayList에 저장된 객체를 다운캐스팅==========");
		for (int i=0; i < fruitList.size(); i++) {
			Fruit f = fruitList.get(i);
			if (f instanceof Apple) {
				Apple ap = (Apple) f;
				ap.app();
			}
			if (f instanceof Orange) {
				Orange or = (Orange) f;
				or.org();
			}
			if (f instanceof Banana) {
				Banana ba = (Banana) f;
				ba.bana();
			}
		}
		
		
		
		
		
		
		
	}
}

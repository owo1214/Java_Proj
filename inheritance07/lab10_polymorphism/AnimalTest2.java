package inheritance07.lab10_polymorphism;

public class AnimalTest2 {	//stack 영역에 메소드 저장 (static)
	public static void moveAnimal(Animal animal) { //업캐스팅
		animal.move(); 
		}
	public static void main(String[] args) {
		AnimalTest2.moveAnimal(new Human());	//static키 : Stack 클래스 이름으로사용 
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
	}
}


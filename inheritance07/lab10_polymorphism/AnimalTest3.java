package inheritance07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) { //업캐스팅
		animal.move(); 
		}
	public static void main(String[] args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		AnimalTest3.moveAnimal(human);	//s
		AnimalTest3.moveAnimal(tiger);
		AnimalTest3.moveAnimal(eagle);
	}


}

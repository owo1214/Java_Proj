package inheritance07.lab11_instanceof;

class Animal {}
class Human extends Animal{}
class Tiger extends Animal{}
class Lion extends Animal{}
class Egle extends Animal{}
class HumanChild extends Human{}
class HumanChildson extends HumanChild{}

public class InstanceOfEx02 {
	static void print (Animal a) {
		if(a instanceof Human) {System.out.println("Human");}
		if(a instanceof Tiger) {System.out.println("Tiger");}
		if(a instanceof Lion) {System.out.println("Lion");}
		if(a instanceof Egle) {System.out.println("Egle");}
		if(a instanceof HumanChild) {System.out.println("HumanChild");}
		if(a instanceof HumanChildson) {System.out.println("HumanChilson");}
		System.out.println();
	}
	

	public static void main(String[] args) {
		System.out.print("new Human() -> \t"); print (new Human());
		System.out.print("new Tiger() -> \t"); print (new Tiger());
		System.out.print("new Lion() -> \t"); print (new Lion());
		System.out.print("new Egle() -> \t"); print (new Egle());
		System.out.print("new HumanChild() -> \t"); print (new HumanChild());
		System.out.print("new HumanChildso() -> \t"); print (new HumanChildson());
		
	}

}

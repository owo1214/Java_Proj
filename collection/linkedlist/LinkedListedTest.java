package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListedTest {	//빈번하게 값을 추가 /삭제 할때 부하가 적게걸린다.

	public static void main(String[] args) {
		LinkedList<String> myList =new LinkedList<String> ();
		
		myList.add("A");	//index 0
		myList.add("B");	//index 1
		myList.add("C");	//index 2
		
		System.out.println(myList);	//LinkedList 의 toString 이 재정의 되어있음
		System.out.println("==== index 1방에 D값 추가 ====");
		myList.add(1,"D");
		
		System.out.println(myList);
		System.out.println("==== addFirst() 메소드 사용 ====");
		myList.addFirst("O");	//첫번째 자리(index 0) 값에 추가
		System.out.println(myList);
		System.out.println("==== addLast() 메소드 사용 ====");
		myList.addLast("K");	//마지막 자리 값에 추가
		System.out.println(myList);
		System.out.println("==== remove() 메소드 사용 ====");
		myList.remove(1);	//index 1 을 삭제 
		System.out.println(myList);
		System.out.println("==== removeLast() 메소드 사용 ====");
		myList.removeLast();//마지막 값을 삭제
		System.out.println(myList);
		System.out.println("==== removeFirst() 메소드 사용 ====");
		myList.removeFirst();//처음값을 삭제
		System.out.println(myList);
	}
}

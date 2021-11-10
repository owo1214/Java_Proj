package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	//1. 정렬 해서 저장  (오름차순)	// hashset과의 차이점
		//comparable 인터페이스의 compareTo() 메소드를 재정의 했기 때문이다.
	//2. 중복된 값을 저장하지 않는다.
	//3. index 값이 없다 (방번호가 없다.) iterator 사용 
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(); //TreeSet 선언
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		System.out.println(treeSet);	//toString() 재정의
		System.out.println("========향상된 for문으로 출력========");
		
		treeSet.add("D");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("G");
		treeSet.add("Z");
		treeSet.add("X");
		
		for (String s : treeSet) {	//향상된 for 문으로 출력
			System.out.print(s +" ");
		}
		System.out.println();
		System.out.println("========Iterator로 출력========");
		
		Iterator<String> ir = treeSet.iterator(); // Iterator 생성
		while (ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
		
		
	}
}

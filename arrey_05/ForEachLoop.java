package arrey_05;

public class ForEachLoop {

	public static void main(String[] args) {	
		//향상된 For문 (Enhanced FOR)
		//배열의 처음부터 마지막까지 순환하면서 값을 출력 할 경우
		String[] strArr = {"Java","Android","C","JavaScript","Python"};
		
		for ( int i=0; i<strArr.length; i++) { 
		//for ( int i=0; i<3; i++)  조건을 사용해서 특정 범위까지 출력
			System.out.println(strArr[i]);
		}
		System.out.println("================Enhanced For=================");
		
		for (String lang: strArr) {
			System.out.println(lang);
		}
	}

}

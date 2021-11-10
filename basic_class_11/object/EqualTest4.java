package basic_class_11.object;

import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
	//문제1. toString 메소드를 재정의 : 2021년 9월 27일 입니다.
	//문제2. equals 메소드 재정의 : 두개의 객체를 만들어서 년,월,일이 같을때 True 리턴 
	//문제3. hashCode 메소드 재정의 : 일 + 월 +년도
	public MyDate() {}
	
	public MyDate(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return year + "년 " + month + "월 "+ day +"일 입니다." ;
	}

	@Override
	public boolean equals(Object obj) {	//업캐스팅 되어서 들어옴 
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;	//다운캐스팅
			if(year == md.year && month == md.month && day == md.day) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year); //Objects.hash()- hash 코드를 만들어줌 
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

public class EqualTest4 {
	
	public static void main(String[] args) {
		MyDate myd1 = new MyDate (28, 9, 2021);	// 생성자를 통해서 값할당
		
		MyDate myd2 = new MyDate();	//직접 객체에 값을 할당  -기본생성자
		myd2.day =28; myd2.month =9; myd2.year = 2021;
		
		MyDate myd3 =new MyDate(); //setter를 통해서 값할당
		myd3.setDay(29); myd3.setMonth(9); myd3.setYear(2021);
		
		
		System.out.println(myd1);
		System.out.println(myd2);
		System.out.println(myd3);
		System.out.println(myd1.equals(myd2));
		System.out.println(myd1.equals(myd3));
		System.out.println("myd1의 해쉬코드 : " +myd1.hashCode());
		System.out.println("myd2의 해쉬코드 : " +myd2.hashCode());
		System.out.println("myd3의 해쉬코드 : " +myd3.hashCode());
		
	}

}

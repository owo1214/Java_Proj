package ex;

public class Ex15 {
	public static void main(String[] args) {
		int a,b;  //a =10의자리 b= 1의 자리 
		
		for (int i=1; i<100; i++) {
			a= i/10 ;		// 10의 자리 처리
			b= i%10 ;		// 1의 자리 처리 
			if (( a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " 박수 짝짝 ");
			} else if  ( (a==3 || a==6 || a==9) && (b!=3 || b!=6 || b!=9) ) {
				System.out.println(i + "박수 짝");
			} else if ((a!=3 || a!=6|| a!=9) && (b==3 || b==6 || b==9)) {
				System.out.println(i + "박수 짝");
			}
			
			
			
		}
		
	}
		
}


package inheritance07.lab4;

public class CustomerTest5 {

	public static void main(String[] args) {
		int price =10000;
		Customer customerLee = new Customer (10010, "이순신");
		System.out.println(customerLee.getCustomerName() + "님이 지불해야할 금액은 "+ 
				customerLee.calcPrice(price));

		VIPCustomer customerKim = new VIPCustomer (10020,"김유신", 12345);
		System.out.println(customerKim.getCustomerName()+ "님이 지불해야할 금액은 "
				+customerKim.calcPrice(price));
		
		Customer vc = new VIPCustomer (10030, "홍길동" ,2000); // 업캐스팅
		System.out.println(vc.getCustomerName()+"님이 지불해야할 금액은 "+
				vc.calcPrice(price));
		//업캐스팅 : 자식 객체를 생성해서 부모 객체의 타입으로 형식을 변환하는것  << 부모 객체의 필드나 메소드만 사용가능
			//단. 메소드 오버라이딩이 있을 경우 동적 바인딩에 의해서 자식 객체의 메소드가 호출된다.
		
	}

}

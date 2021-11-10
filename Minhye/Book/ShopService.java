package Minhye.Book;

public class ShopService { //18번
	
	private static ShopService ShopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return ShopService;
	}

}

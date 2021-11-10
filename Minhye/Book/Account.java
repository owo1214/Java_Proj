package Minhye.Book;

public class Account {//19-1
	static final int Min = 0;
	static final int Max = 1000000;
	
	private int balance = 0;
	
	void setBalance (int balance) {
		if (balance >= Min && balance <= Max) {
			this.balance = balance;
		}
	}
	int getBalance() {
		return this.balance;
	}
}

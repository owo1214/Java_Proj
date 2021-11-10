package Minhye.chap06;

public class Account {	//계좌를 생성하는 클래스 
	private String ano;		//계좌
	private String owner;	//소유주
	private int balance;	//돈
	
	public Account(String ano, String owner, int balance) {
		this.ano =ano;
		this.owner =owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

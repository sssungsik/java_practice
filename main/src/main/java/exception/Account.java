package main.java.exception;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws IssufficientException{ // 호출한 곳으로 예외 떠넘김
		if(balance < money) {
			throw new IssufficientException("잔고 부족" + (money - balance) + " 원 부족"); // 예외 발생
		}
		balance -= money;
	}
}

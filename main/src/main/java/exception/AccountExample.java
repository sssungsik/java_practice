package main.java.exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println(account.getBalance() + "  원  예금됨.");
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch (IssufficientException e) { // 예외처리 코드와 withdraw 메소드 호출
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}

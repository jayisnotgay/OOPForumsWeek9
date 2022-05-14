package BankingForum;

public class Account {
	
	public Account() {
		this.balance = 0;
	}
	
	private int balance;
	
	public Account (int initBalance) {
		balance = initBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	public boolean setDeposit(int deposit) {
		if(deposit > 0) {
			this.balance = balance+deposit;
			return true;
		}
		else {
			return false;
		}
	}
		
	public boolean setWithdraw(int withdraw) {
		if (withdraw <= balance) {
			this.balance = balance-withdraw;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean setTransfer(int transfer) {
		if (transfer <= balance) {
			this.balance = balance-transfer;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean setReceive(int receive) {
		if(receive > 0) {
			this.balance = balance+receive;
			return true;
		}
		else {
			return false;
		}
	}
}

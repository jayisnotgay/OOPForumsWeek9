package BankingForum;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	    
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
		this.account = new Account(0);
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account acct) {
		account = acct;
	}
}

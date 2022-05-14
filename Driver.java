package BankingForum;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		Bank BCA = new Bank();
		BCA.setbankName("BCA");
		
		BCA.addCustomer("Jairo", "Siegers");
		BCA.addCustomer("Alfin", "Rizqullah");
		
		System.out.println("Bank Name: " + BCA.getbankName());
		
		System.out.println("Do you already have a bank account? (yes/no)");
		
		switch(scanner.nextLine()) {
			case "no":{
				System.out.println("Enter your first name: ");
				String firstname = scanner.nextLine();
				System.out.println("Enter your last name: ");
				String lastname = scanner.nextLine();
				BCA.addCustomer(firstname, lastname);
				System.out.println("Welcome, "+firstname);
				break;
			}
			case "yes":{
				break;
			}
			
		}
		
		while(running) {
		
		System.out.println("Please select your account! (enter number)");
		System.out.println("Bank Customers: " + BCA.getNumOfCustomers());
		BCA.getAllCustomer();
		String stringIndex = scanner.nextLine();
		int index = parseInt(stringIndex)-1;
		Customer customer = BCA.getCustomer(index);
		
		System.out.println("Hello, "+customer.getfirstName()+".");
		System.out.println("Please select whether you would like to withdraw, deposit, check balance, transfer, or quit. (withdraw/deposit/balance/transfer/quit)");
		
		switch(scanner.nextLine()) {
			case "deposit":{
				System.out.println("Please enter your deposit amount: ");
				String stringamount = scanner.nextLine();
				int amount = parseInt(stringamount);
				if(customer.getAccount().setDeposit(amount)) {
					System.out.println("Deposit successful");
				}else {
					System.out.println("Deposit denied");
				}
				System.out.println("Your balance is $"+customer.getAccount().getBalance());
				break;
			}
			
			case "withdraw":{
				System.out.println("Please enter your withdraw amount: ");
				String stringamount = scanner.nextLine();
				int amount = parseInt(stringamount);
				if(customer.getAccount().setWithdraw(amount)) {
					System.out.println("Withdraw successful");
				}else {
					System.out.println("Withdraw denied");
				}
				System.out.println("Your balance is $"+customer.getAccount().getBalance());
				break;
			}
			
			case "balance":{
				System.out.println("Your balance is $"+customer.getAccount().getBalance());
				break;
			}
			
			case "transfer":{
				System.out.println("Please select the account you're transferring to: (enter number)");
				System.out.println("Bank Customers: " + BCA.getNumOfCustomers());
				BCA.getAllCustomer();
				String stringindex = scanner.nextLine();
				int index2 = parseInt(stringindex)-1;
				System.out.println("Enter the amount: ");
				String stringamount = scanner.nextLine();
				int amount = parseInt(stringamount);
				Customer customertransfer = BCA.getCustomer(index2);
				customer.getAccount().setTransfer(amount);
				customertransfer.getAccount().setReceive(amount);
				System.out.println("Your balance is $"+customer.getAccount().getBalance());
				break;
			}
			
			case "quit":{
				running = false;
				break;
			}
		}
		}
	}
}

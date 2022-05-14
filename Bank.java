package BankingForum;
import java.util.ArrayList;


public class Bank {
	private String bankName;
	private int numberOfCustomers;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void setbankName(String bName) {
		this.bankName = bName;
	}
	
	public String getbankName() {
		return bankName;
	}
	
	public void addCustomer(String f, String l) {
		Customer newCustomer = new Customer(f, l);
		customers.add(newCustomer);
	}
	
	public Customer getCustomer(int index) {
        return customers.get(index);
	}
	
	public int getNumOfCustomers() {
		numberOfCustomers = customers.size();
		return numberOfCustomers;
	}
	
	public void getAllCustomer() {
		for(int index = 0; index < customers.size(); index++) {
			System.out.println((index+1)+". "+customers.get(index).getfirstName()+" "+customers.get(index).getlastName());
		}
	}
}

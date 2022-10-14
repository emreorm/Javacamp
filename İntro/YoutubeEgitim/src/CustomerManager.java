
public class CustomerManager {
	Customer _customer;
	ICreditManager  creditManager;
	
	;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		customer = _customer;
		this.creditManager = creditManager;
		
		
	}
	
	

	public void Save(Customer customer) {
		System.out.println("savelendi" + " ");
	}
	
	public void Delete(Customer customer) {
		System.out.println("silindi :" );
	}
	public void GiveCredit() {
	    
		
		System.out.println("kredi verildi");
		creditManager.Save();

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

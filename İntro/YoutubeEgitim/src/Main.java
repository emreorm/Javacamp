

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Hesapla();
		creditManager.Save();
		
		Customer customer = new Customer();
		Company company = new Company();
		customer.setFirstName("emreorm");
		customer.setId(15);
		customer.setLastName("seko");
		customer.setNationalIdentitiy(565212);
		company.setTaxNumber(563);
		company.setFirstName("arda"); 
		
		
		
		
		
		
		System.out.println("urun : " + customer.getId ());
		System.out.println(customer.getNationalIdentitiy());
		System.out.println(customer.getFirstName());
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager() );
	    customerManager.Save(customer);
	    customerManager.Save(customer);
	    customerManager.Delete(customer);
	    customerManager.GiveCredit();
	    
	    
	    
	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

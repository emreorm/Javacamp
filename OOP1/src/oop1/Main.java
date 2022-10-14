package oop1;

public class Main {

	public static void main(String[] args) {
		
        Product product1 = new Product();
        product1.setName("Delongi");
        product1.setDiscount(7);
	    product1.setUnitPrice(7500);
	    product1.setUnitInStock(3);
	    product1.setImageUrl("image1.jpg");

		
		Product product2 = new Product();
		product2.setName("Di");
        product2.setDiscount(5);
	    product2.setUnitPrice(6500);
	    product2.setUnitInStock(5);
	    product2.setImageUrl("image3.jpg");

		

		Product product3 = new Product();
		product3.setName("Deasd");
        product3.setDiscount(6);
	    product3.setUnitPrice(3500);
	    product3.setUnitInStock(4);
	    product3.setImageUrl("image3.jpg");

		
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			
		}
		
		İndividualCustomer individualCustomer = new İndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05423654");
		individualCustomer.setCustumerNumber("15654");
		individualCustomer.setFirstName("emre");
		individualCustomer.setLastName("orman");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("06562359");
		corporateCustomer.setCustumerNumber("653");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		

	}

}

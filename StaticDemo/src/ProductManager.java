
public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
			
			
		}else {
			System.out.println("urun bilgileri gecersiz");
		}
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
		
	}

}

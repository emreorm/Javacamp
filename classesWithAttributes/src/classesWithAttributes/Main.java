package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","asuslaptop",3000	,3,"siyah");

		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getDescription());

	}

}

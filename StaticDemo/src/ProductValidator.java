
public class ProductValidator {
	static {
		System.out.println("Static Yapici Blok Calisti");
	}
	public ProductValidator() {
		System.out.println("Yapici Blok Calisti");
	}
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
		
	}
	public static void bisey() {
		
	}
	public static class baskaBirClass{ //inner class
		public static void Sil() {
			
		}
	}

}

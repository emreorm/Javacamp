package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibarnateProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

}

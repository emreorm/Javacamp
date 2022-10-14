package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile veritabanina eklendi");
	}
	

}
 
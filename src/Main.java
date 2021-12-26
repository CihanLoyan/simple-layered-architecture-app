
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.SpringConfigProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
	
	public static void main(String[] args) {
		Product bilgisayar = new Product(1, 3, "MacBook Pro", 16.500, 5);
		Product telefon = new Product(2, 1, "Samsung Note", 9.500, 15);
		
		ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService2 = new ProductManager(new SpringConfigProductDao());
		
		productService.add(bilgisayar);
		productService2.add(telefon);
	}
	
}

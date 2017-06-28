package io.altar.jseproject.repository;

import io.altar.jseproject.model.Product;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
//import io.altar.jseproject.repository.EntityRepository;

@Named("productRepository")
@ApplicationScoped
public class ProductRepository extends EntityRepository<Product> {
	
	//private static final ProductRepository INSTANCE = new ProductRepository();

	//private ProductRepository() {}

	//public static ProductRepository getInstance() {
		//return INSTANCE;
	//}
	
	public void alterElement(Integer id, String productName, Integer discount, Integer iva, Double pvp) {
		
		((Product) get(id)).setProductName(productName);	
		((Product)get(id)).setDiscount(discount);
		((Product)get(id)).setIva(iva);
		((Product)get(id)).setPvp(pvp);
	}
}
//ProductRepository.getInstance().
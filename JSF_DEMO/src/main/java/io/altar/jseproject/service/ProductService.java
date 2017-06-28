package io.altar.jseproject.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repository.ProductRepository;

@Named("ProductService")
@ApplicationScoped
public class ProductService extends EntityService<Product> {

	@Inject
	private ProductRepository productList;
	
	public ProductRepository getProductRepository(){
		
		return productList;
	}
	
	public void editProduct(Product product){
		productList.alterElement(product.getId(), product.getProductName(), product.getDiscount(), product.getIva(), product.getPvp());
	}
	
}

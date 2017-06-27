package io.altar.jseproject.model;

import java.util.ArrayList;
import io.altar.jseproject.repository.ProductRepository;

public class Product extends Entity {
	
	private ArrayList<Integer> shelfIdLocation;
	private String productName;
	private Integer discount;
	private Integer iva;
	private Double pvp;
	
	public ArrayList<Integer> getShelfIdLocation() {
		return shelfIdLocation;
	}
	public void setShelfIdLocation(ArrayList<Integer> shelfIdLocation) {
		this.shelfIdLocation = shelfIdLocation;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getIva() {
		return iva;
	}
	public void setIva(Integer iva) {
		this.iva = iva;
	}
	public Double getPvp() {
		return pvp;
	}
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}
	
	public Product() {
		
	}
	
	@Override
	public String toString(){
		
		return "Id:" + getId() + " | Nome: " + productName + " | PVP: " + pvp + "€ | IVA: " + iva + "% | Desconto: " + discount + "€";
	}
}

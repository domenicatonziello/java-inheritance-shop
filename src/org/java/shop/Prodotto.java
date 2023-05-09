package org.java.shop;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private int price;
	private int iva;
	
	public Prodotto(int code, String name, String brand, int price, int iva){
		this.code = code;
		setName(name);
		setBrand(brand);
		setPrice(price);
		setIva(iva);
	}
	
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public int totalPrice() {
		return getPrice() * (1 + getIva() / 100);
	}
	
	public String productString() {
		return "Prodotto" + getCode() 
		+ "\nnome prodotto : " + getName()
		+ "\nbrand : " + getBrand()
		+ "\nprezzo senza iva : " + getPrice()
		+ "\niva : " + getIva()
		+ "\nprezzo con iva : " + totalPrice();
	}
	
	@Override
	public String toString() {
		return productString();
	}
	
}

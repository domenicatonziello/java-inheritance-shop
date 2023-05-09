package org.java.shop;

public class Cuffie extends Prodotto{

	private String color;
	private boolean wireless;
	private boolean cablate;
	
	public Cuffie(int code, String name, String brand, int price, int iva,
			String color, boolean wireless, boolean cablate) {
		super(code, name, brand, price, iva);
		setColor(color);
		setWireless(wireless);
		setCablate(cablate);
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	public boolean isCablate() {
		return cablate;
	}
	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nColore : " + getColor()
				+ "\nWireless : " + isWireless()
				+ "\nCablate : " + isCablate();
				
	}

}

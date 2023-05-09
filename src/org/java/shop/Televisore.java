package org.java.shop;

public class Televisore extends Prodotto{

	private int size;
	private boolean smart;
	
	public Televisore(int code, String name, String brand, int price, int iva,
			int size, boolean smart) {
		super(code, name, brand, price, iva);
		setSize(size);
		setSmart(smart);
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nDimensioni : " + getSize() + "pollici"
				+ "\nSmart : " + isSmart();
				
	}
	
	

}

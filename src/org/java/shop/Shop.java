package org.java.shop;

public class Shop {
	 public static void main(String[] args) {
		 
		Smartphone phone = new Smartphone(101010,"Galaxy S23", "Samsung", 900, 250,
				  11111, 128);
		System.out.println(phone);
		System.out.println("----------------------");
		
		Televisore tv = new Televisore(222222, "tv smart", "LG", 400, 120,
				44, true);
		System.out.println(tv);
		System.out.println("----------------------");
		
		Cuffie cuffie = new Cuffie(444444444, "Airpods", "Apple", 250, 20,
				"white", true, false);
		System.out.println(cuffie);
		System.out.println("----------------------");
		
	}
}

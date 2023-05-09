package org.java.shop;

import java.util.Scanner;

public class Catalogo {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  while(true) {
		  System.out.println("Cosa vuoi inserire? Digita: 1 per Smartphone, 2 per Televisore, 3 per Cuffie, 4 per uscire");
		  int userChoise = sc.nextInt();
		  
		  if (userChoise < 1 || userChoise > 4) {
				
				System.err.println("Scelta non trovata");
				
				continue;
			}
		  if (userChoise == 4){
			  System.out.println("Arrivederci");
			   return;
		  }
		  
		  System.out.println("Inserisci codice");
		  int productCode = sc.nextInt();
		  System.out.println("Inserisci nome");
		  String productName = sc.next();
		  System.out.println("Inserisci brand");
		  String productBrand = sc.next();
		  System.out.println("Inserisci prezzo");
		  int productPrice = sc.nextInt();
		  System.out.println("Inserisci iva");
		  int productIva = sc.nextInt();
		   
		  
		  switch(userChoise){
		  	case 1: {
		  		System.out.println("Inserisci codice IMEI");
				int phoneImeiCode = sc.nextInt();
				System.out.println("Inserisci memoria");
				int phoneMemory = sc.nextInt();
				  
				Smartphone userSmartPhone = new Smartphone(productCode, productName, productBrand, productPrice, productIva, phoneImeiCode, phoneMemory);
		  	}
		  	break;
		  	case 2 : {
		  		System.out.println("Inserisci dimensioni");
				int tvSize = sc.nextInt();
				System.out.println("è smart?");
				boolean tvSmart = sc.nextBoolean();
				Televisore usertv = new Televisore(productCode, productName, productBrand, productPrice, productIva, tvSize, tvSmart);
		  	}
		  	break;
		  	case 3 : {
		  		System.out.println("Inserisci colore");
				String podsColor = sc.next();
				System.out.println("sono wireless?");
				boolean podsWireless = sc.nextBoolean();
				System.out.println("sono cablate?");
				boolean podsCablate = sc.nextBoolean();
				Cuffie pods = new Cuffie(productCode, productName, productBrand, productPrice, productIva, podsColor, podsWireless, podsCablate);
		  	}
		  	break;
		  }
	  }
	  
  }
}

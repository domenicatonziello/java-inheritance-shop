package org.java.shop;

import java.util.Scanner;

public class Catalogo {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	  Prodotto[] listaProdotti = new Prodotto[100];
	  int i = 0;
	  
	  
	  while(true) {
		  System.out.println("Cosa vuoi inserire? Digita: 1 per Smartphone, 2 per Televisore, 3 per Cuffie, 4 per uscire");
		  int userChoise = sc.nextInt();
		  
		  if (userChoise < 1 || userChoise > 4) {
				
				System.err.println("Scelta non trovata");
				
				continue;
			}
		  if (userChoise == 4){
			  System.out.println("Lista Prodotti: ");
			  for(int x = 0; x < listaProdotti.length; x++) {
				  
				  Prodotto elemento = listaProdotti[x];
				  
				  if(elemento instanceof Smartphone) {
					  Smartphone phone = (Smartphone) elemento;
					  System.out.println(phone);
					  System.out.println("-----------------------------");
				  }else if(elemento instanceof Televisore) {
					  Televisore tv = (Televisore) elemento;
					  System.out.println(tv);
					  System.out.println("-----------------------------");
				  } else if (elemento instanceof Cuffie){
					  Cuffie pods = (Cuffie) elemento;
					  System.out.println(pods);
					  System.out.println("-----------------------------");
				  }
				  sc.close();
			  }
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
				  
				listaProdotti[i] = new Smartphone(productCode, productName, productBrand, productPrice, productIva, phoneImeiCode, phoneMemory);
				i++;
		  	}
		  	break;
		  	case 2 : {
		  		System.out.println("Inserisci dimensioni");
				int tvSize = sc.nextInt();
				System.out.println("è smart?");
				boolean tvSmart = sc.nextBoolean();
				listaProdotti[i]  = new Televisore(productCode, productName, productBrand, productPrice, productIva, tvSize, tvSmart);
				i++;
		  	}
		  	break;
		  	case 3 : {
		  		System.out.println("Inserisci colore");
				String podsColor = sc.next();
				System.out.println("sono wireless?");
				boolean podsWireless = sc.nextBoolean();
				System.out.println("sono cablate?");
				boolean podsCablate = sc.nextBoolean();
				listaProdotti[i] = new Cuffie(productCode, productName, productBrand, productPrice, productIva, podsColor, podsWireless, podsCablate);
				i++;
		  	}
		  	break;
		  }
		  
	  }
  }
}


//exercice1:

package variable1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Quel est votre nom");
        String nom = input.next();
        System.out.println("bonjour " +nom);

	}

}

//exercice 2:

package tt;

import java.util.Scanner;

public class tva {

	public static void main(String[] args) {
		
		      Scanner input = new Scanner(System.in);
		      
		      
		      double ht=0.0,tva=0.0,ttc=0.0,r=0.0,netc=0.0;
		    	  System.out.println("Entrer le prix ");
		    	  int prix=input.nextInt();
		      System.out.println(" tu veux la remise");
		      String reponse=input.next().toLowerCase();
		      if(reponse.equals("oui")|| reponse.equals("yes")) {
		    	  r=prix*0.1;
		    	  netc=prix-r;
		      }
		      else if(reponse.equals("non") || reponse.equals("no")) {
		    	  netc=prix;
		      }
		      tva=netc*0.2;
		      ttc=netc+tva;
		      
		      System.out.println("le montant est "+prix+"MAD");
		      System.out.println("la remise 1% est "+r+"MAD");
		      System.out.println("net commercial est "+netc+"MAD");
		      System.out.println("tva est "+tva+"MAD");
		      System.out.println("ttc est "+ttc+"MAD");
      
			}

}


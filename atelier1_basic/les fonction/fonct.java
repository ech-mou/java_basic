package les_function;

import java.util.Scanner;

public class fonct {

	public static void main(String[] args) {
		tr();
		//nombre();
        
	}
	//1)-
	public static void tr() {
		int a=0;
		boolean b = (a==0);
		System.out.println(b);
	}
	//2)-
	/*public static void tr() {
		String a = "mouhsine";
		System.out.println(a);
	}*/
	//3)-
	/*public static void tr() {
		String a = "mouhsine";
		String b = " echchoufi";
		System.out.println(a + b);
	}*/
	//4)-
	/*public static void nombre(int a , int b) {
		  if(a>b) {
			  System.out.println("Le premier nombre est plus grand ");
		  }else if(a<b){
			  System.out.println("Le premier nombre est plus petit  ");
		  }else {
			  System.out.println("Les deux nombres sont identiques   ");

		  }
	  }*/
	  //5)-
	    /*public static void nombre(int a , String b) {
			System.out.println(a + b );
		}*/
	  //6)-
	   /* public static void nombre(String a , String b , int c) {
		System.out.println("Bonjour " + a + b + ",tu as " + c + " ans");
	}*/
	//7)-
	  /*public static void nombre() {
		Scanner input = new Scanner(System.in);
		System.out.println("quel est votre genre");
        int a = input.nextInt();
        System.out.println("quel est votre age");
        int b = input.nextInt();
        if(a == 1 && b > 18) {
        	System.out.println("Vous êtes un homme et vous êtes majeur");
        }else if(a == 1 && b < 18) {
        	System.out.println("Vous êtes un homme et vous êtes mineur");
        } else if(a == 2 && b > 18) {
        	System.out.println("Vous êtes un femme et vous êtes majeur");
        }else  {
        	System.out.println("Vous êtes un femme et vous êtes mineur");
        }}*/
	
	   //8)-
	   /*public static void nombre() {
		double t = 0.0;
		Scanner input = new Scanner(System.in);
		 for (int i = 1; i <= 3; i++) {
	    	  System.out.println("Entrer le nombre "+i);
	    	  int prix=input.nextInt();
	    	  t+=prix;
	      }
		System.out.println("la somme de ces nombres est " +t);
	}*/
	
}

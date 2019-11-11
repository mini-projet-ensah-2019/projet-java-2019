package ma.porjet.ensah2019;
 /*
  * mory moussa camara et bouchra
  */
import java.util.Scanner;

import ma.porjet.ensah2019.Vols.Vol;

public class Main {
     
	public static void main(String[] args) {
	
		
		System.out.println();
		int choix=1;   
		
		Scanner clavier = new Scanner(System.in);
		do {
		    Menu.Acceuil();
		    System.out.print("Reponse:");
		    choix=clavier.nextInt();
             switch (choix) {
		       case 1:
		    	        new Vol();

		    	        break;
		       case 2:
			             Menu.reservation();
			    break;
		       case 3:
			           Menu.listVente();
		       case 4:
			          Menu.listReservation();
			   break;
		       case 5:
			         Menu.listeVols();
			    break;
		       case 6:
		           	 System.out.println("*********Au revoir!!!!*********");
			         System.exit(0);
			    break;
		       default:
		    	   System.out.println();
			          System.err.println("        Option non disponible!!!");
			          System.out.println();
			    break;
		      }
		}while(choix!=6);
       clavier.close();
	}
  
}

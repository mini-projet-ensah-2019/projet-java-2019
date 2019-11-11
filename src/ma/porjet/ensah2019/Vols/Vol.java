package ma.porjet.ensah2019.Vols;

import java.util.Scanner;

import ma.passages.Personne;
import ma.porjet.ensah2019.Date;
import ma.porjet.ensah2019.Menu;

public class Vol {
	
	Scanner clavier = new Scanner(System.in);
public Vol() {
    this.saisirInfo();
}
public void saisirInfo() {
	int choix;
	System.out.println("          ------------------------------------------ ");
	System.out.println("                       VENTE DE BILLET           ");
	System.out.println("          -------------------------------------------- ");
	System.out.println("\n        1:Aller simlpe        2:Aller retour       3:Quitter  ");
    System.out.println();
    System.out.print("Reponse:");
            switch (choix=clavier.nextInt()) {
                  case 1:
                   VolSimple simple = new VolSimple();
                     break ;
                   case 2:
                     AllerRetour composer= new AllerRetour();
                     break;
                    case 3:
                      System.out.println("Au revoir");
                       System.exit(0);
                      break;
                       default:
                       System.out.println("Choix non disponible");
                        break;
                }
          
}


}

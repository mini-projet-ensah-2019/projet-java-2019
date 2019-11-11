package ma.porjet.ensah2019;

//@AUTOR MORY MOUSSA CAMARA ET BOUCHRA
public class Menu {
	static public void  Acceuil() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("               BIENVENUE DANS NOTRE PLATEFORME");
		System.out.println("              ----------------------------------");
		System.out.println("             VEUILLEZ CHOISIR LE TRAITEMENT A FAIRE");
		System.out.println("       ---------------------------------------------------");
		System.out.println("     1:VENTE DE BILLET"+"              "+"2:RESERVATION");
		System.out.println("");
		System.out.println("     3:LISTE DES VENTES"+"            "+"4:LISTE DES RESERVATIONS");
		System.out.println("");
		System.out.println("     5:LISTE DES VOLS"+"            "+"6:QUITTER");
		System.out.println("     ************************************************************");
	}

	static public void vent() {
		System.out.println("          ------------------------------------------ ");
		System.out.println("                       VENTE DE BILLET           ");
		System.out.println("          -------------------------------------------- ");
		System.out.println(" \n                Selectionner une categorie  s'il vous plait");
		System.out.println("\n       1:Adulte                   2:Etudiant          3:Enfant\n");
		System.out.println("        4:Retour                   5:Quitter");
		System.out.println("\n     ************************************************************");
	}
	static public void listeVols() {
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                    LISTE DES VOLS DISPONIBLES          ");
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                        TODO");
	}
	static public void listVente() {
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                    LISTE DES  BILLETS VENDUS           ");
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                     TODO");
	}
	static public void reservation() {
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                    RESERVATION DU BILLET           ");
		System.out.println("      ------------------------------------------------ ");
		System.out.println("                     TODO");
	}
	static public void listReservation() {
		System.out.println("      ---------------------------------------------- ");
		System.out.println("                    LISTE DES RESERVATIONS          ");
		System.out.println("      ------------------------------------------------ ");
		System.out.println("                      TODO");
	}

}

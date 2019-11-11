package ma.porjet.ensah2019.Vols;

import java.util.Scanner;

import ma.passages.Adulte;
import ma.passages.Enfant;
import ma.passages.Etudiant;
import ma.passages.Personne;
import ma.porjet.ensah2019.Date;

public class VolSimple {
	private int ref= (int)(Math.random()*10000);
	private Date depart;
	private Ville origine;
	private Ville destination;
	private Personne client;
	private Double prix;
	Scanner clavier = new Scanner(System.in);
	public VolSimple() {
		origine = new Ville();
		destination = new Ville();
		depart = new Date();
		this.setInfo();
		this.infoBillet();
	}
  private void infoBillet() {
	  System.out.println("--------------------------------------------------------");
		System.out.println("Ref:"+ref);
		depart.infos_date();
		System.out.println("Ville de depart:"+origine.getNomVille() +"           "+" Ville d'arrivee:"+destination.getNomVille());
		client.infosPersonne();
	}
public void setInfo() {
	  System.out.print("Donner la ville de depart:");
		origine.setVille(clavier.nextLine());
		System.out.print("\nDonner la ville d'arrivee:");
		destination.setVille(clavier.nextLine());
		System.out.print("\nDonner la date de depart (ex:14/02/2000):");
		depart.saisir_date();
		int choix=1;
		do {
		System.out.println(" \n                Selectionner une categorie  s'il vous plait");
		System.out.println("\n       1:Adulte                   2:Etudiant          3:Enfant\n");
		System.out.print("Reponse:");
		switch (choix=clavier.nextInt()) {
		case 1:
			  client = new Adulte();
			break;
        case 2:
			  client = new Etudiant();
			break;
         case 3:
			  client = new Enfant();
			break;
		default:
			System.err.println("Saisie non valide!!");
			break;
		}
		}while(choix!=1 && choix!=2 && choix!=3);
		client.saisirPersonne();
  }
}

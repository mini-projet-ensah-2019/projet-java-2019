package ma.passages;

import java.util.Scanner;

import ma.porjet.ensah2019.DateException;

public class Personne {
	protected String nom;
	protected String prenom;
	//protected Date date_naissance;
    protected String profession;
    protected String numero_passeport;
	Scanner clavier = new Scanner(System.in);
	public Personne() {
		//date_naissance = new Date();
	}
	public void saisirPersonne(){
		System.out.print("Donner le nom:");
		nom=clavier.nextLine();
		System.out.print("Donner le prenom:");
		prenom=clavier.nextLine();
		System.out.print("Numéro de passeport:");
		numero_passeport = clavier.nextLine();
//		System.out.println("Donner la date de naissance:");
//		date_naissance.saisir_date();
	}
	public void infosPersonne() {
		System.out.println("Passeport:"+getNumero_passeport());
		System.out.println("Nom:"+getNom());
		System.out.println("Prenom:"+getPrenom());
//		System.out.print("Date de naissance:");
//		date_naissance.infos_date();System.out.print("Date de naissance:");
//		d
		System.out.println("Profession:"+getProfession());
		System.out.println();
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    public String getNumero_passeport() {
		return numero_passeport;
	}
    public void setNumero_passeport(String numero_passeport) {
		this.numero_passeport = numero_passeport;
	}
}

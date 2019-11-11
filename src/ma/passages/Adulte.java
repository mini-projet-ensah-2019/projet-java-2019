package ma.passages;

import java.util.Scanner;

public class Adulte extends Personne{
	Scanner clavier = new Scanner(System.in);
public Adulte() {
	super();
}
@Override
public void saisirPersonne() {
		super.saisirPersonne();
	System.out.print("Profession:");
	profession = clavier.nextLine();
}
}

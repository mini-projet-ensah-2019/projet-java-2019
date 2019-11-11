package ma.passages;

public class Etudiant extends Personne{
	final private float remise=10/100;
  public Etudiant() {
	super();
	this.profession="Etudiant";
}
	public float getRemise() {
		return remise;
	}

}

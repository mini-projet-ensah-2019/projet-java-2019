package ma.passages;

public class Enfant extends Personne{
	final private float remise=20/100;
	public Enfant() {
		super();
		this.profession = "Neant";
	}
	public float getRemise() {
		return remise;
	}

}

package personnages;

public class Humain {
	private String nom;
	private String favBoisson;
	protected int argent;
	

	public Humain(String nom, String favBoisson, int argent) {
		this.nom = nom;
		this.favBoisson = favBoisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String message) {
		System.out.println("("+this.nom+")- "+message);
	}
	
	public void direBonjour() {
		parler("Bonour! Je m'appelle "+this.nom+" et j'aime boire du "+this.favBoisson+".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+this.favBoisson+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(this.argent>prix) {
			parler("J'ai "+this.argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			this.argent-=prix;
		}else {
			parler("Je n'ai plus que "+this.argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
	
	private void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	private void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
}

package personnages;

public class Ronin extends Humain{

	private int honneur=1;
	
	public Ronin(String nom, String favBoisson, int argent) {
		super(nom, favBoisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int don=this.argent/10;
		parler(beneficiaire.getNom()+"  prend ces "+don+" sous.");
		this.argent-=don;
		beneficiaire.recevoir(don);
	}
	
}

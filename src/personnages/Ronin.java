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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(this.honneur*2>adversaire.getHonneur()) {
			parler("Je t’ai eu petit yakusa!");
			this.argent+=adversaire.perdre();
			this.honneur++;
		}else {
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.argent);
			this.argent=0;
			this.honneur--;
		}
	}
	
}

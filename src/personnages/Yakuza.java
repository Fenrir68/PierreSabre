package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int honneur=0;
	
	public Yakuza(String nom, String favBoisson, int argent, String clan) {
		super(nom, favBoisson, argent);
		this.clan=clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain=victime.seFaireExtorquer();
		this.argent+=gain;
		this.honneur++;
		parler("J’ai piqué les "+gain+" sous de Marco, ce qui me fait "+this.argent+" sous dans ma poche. Hi ! Hi !");
	}
	
	public void gagner(int gain) {
		this.argent+=gain;
		this.honneur++;
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	
	public int perdre() {
		int perte=this.argent;
		this.argent=0;
		this.honneur--;
		parler("J’ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+this.clan+".");
		return perte;
	}

	public int getHonneur() {
		return honneur;
	}

}

package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int honneur;
	
	public Yakuza(String nom, String favBoisson, int argent, String clan) {
		super(nom, favBoisson, argent);
		this.clan=clan;
		this.honneur=0;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int gain=victime.seFaireExtorquer();
		this.argent+=gain;
		this.honneur++;
		parler("J’ai piqué les "+gain+" sous de Marco, ce qui me fait "+this.argent+" sous dans ma poche. Hi ! Hi !");
	}

}

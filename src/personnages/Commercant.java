package personnages;

public class Commercant extends Humain{

	public Commercant(String name, int money) {
		super(name, "thé", money);
	}

	public int seFaireExtorquer() {
		int argentPerdu=this.money;
		this.money=0;
		this.parler("J’ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		this.money+=argent;
		parler(argent+" sous ! Je te remercie généreux donateur!");
	}

}

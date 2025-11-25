package personnages;

public class Humain {
	protected static final int NB_CONNAISSANCE_MAX=3;
	private String nom;
	private String favBoisson;
	protected int argent;
	protected Humain memoire[]=new Humain[NB_CONNAISSANCE_MAX];
	

	public Humain(String nom, String favBoisson, int argent) {
		this.nom = nom;
		this.favBoisson = favBoisson;
		this.argent = argent;
		for(int i=0; i<NB_CONNAISSANCE_MAX; i++) {
			memoire[i]=null;
		}
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
	
	protected void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	protected void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	public void faireConnaissance(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain autreHumain) {
		int i=0;
		while(i<NB_CONNAISSANCE_MAX && memoire[i]!=null) {
			i++;
		}
		if(i==NB_CONNAISSANCE_MAX) {
			for(int k=NB_CONNAISSANCE_MAX-1; k>0; k--) {
				memoire[k]=memoire[k-1];
			}
			i=0;
		}
		memoire[i]=autreHumain;
	}
	
	private void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		StringBuilder connaissanceStr = new StringBuilder();
		int i=0;
		while(i<NB_CONNAISSANCE_MAX && memoire[i]!=null) {
			connaissanceStr.append(memoire[i].getNom());
			if(++i<NB_CONNAISSANCE_MAX && memoire[i]!=null) {
				connaissanceStr.append(",");
			}
		}
		parler("Je connais beaucoup de monde dont : "+connaissanceStr.toString());
	}
	
}




























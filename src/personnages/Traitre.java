package personnages;
import java.util.Random;

public class Traitre extends Samourai{

	private int niveauTraitrise=0;
	
	public Traitre(String nom, String favBoisson, int argent, String seigneur) {
		super(nom, favBoisson, argent, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+niveauTraitrise+". Chut !");
	}
	
	public void ranconner(Commercant victime) {
		if(niveauTraitrise<3) {
			int argentRanconner = victime.getArgent()/5;
			victime.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne moi "+argentRanconner+" sous ou gare à toi!");
			victime.parler("Tout de suite grand "+getNom()+".");
			niveauTraitrise++;
		}else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		Random random=new Random();
		int nbConnaissance = getNbConnaissance();
		if(nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}else {
			Humain ami = memoire[random.nextInt(nbConnaissance)];
			int don = argent / 20;
			parler("Il faut absolument que je remonte ma cote de confiance. Je vais faire ami ami avec "+ami.getNom()+".");
			parler("Bonjour l'ami! Je voudrais vous aider en vous donnant "+don+" sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);;
			ami.parler("Merci "+this.getNom()+". Vous êtes quelqu'un de bien.");
			if(niveauTraitrise>0) {
				niveauTraitrise--;
			}
		}
	}

}

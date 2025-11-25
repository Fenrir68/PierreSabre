package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		HistoireTP4 h=new HistoireTP4();
		h.scenario5();
	}
	
	public void scenario1() {
		Humain humain=new Humain("Prof", "kombucha", 54);
		humain.direBonjour();
		humain.acheter("une boisson", 12);
		humain.boire();
		humain.acheter("un jeu", 2);
		humain.acheter("un kimono", 50);
	}
	
	public void scenario2() {
		Commercant marco=new Commercant("Marco", 512);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
	
	public void scenario3() {
		Commercant marco=new Commercant("Marco", 15);
		Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.extorquer(marco);
	}
	
	public void scenario4() {
		Commercant marco=new Commercant("Marco", 15);
		Ronin roro=new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}
	
	public void scenario5() {
		Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		Ronin roro=new Ronin("Roro", "shochu", 54);
		roro.provoquer(yaku);
	}
}

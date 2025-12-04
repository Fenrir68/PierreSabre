package histoire;

import personnages.*;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		HistoireTP5 h=new HistoireTP5();
		
		h.scenarion3();
	}
	
	public void scenarion3() {
		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Samourai akimoto= new Samourai("Akimoto", "saké", 512, "Miyamoto");
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissance(masako);
		masako.ranconner(kumi);
		masako.faireConnaissance(yaku);
		masako.faireLeGentil();
		masako.faireConnaissance(roro);
		
	}
	
	public void scenarion1() {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
	}
	
	public void scenarion2() {
		Samourai akimoto= new Samourai("Akimoto", "saké", 512, "Miyamoto");
		Commercant marco = new Commercant("Marco", 20);
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		
	}
}

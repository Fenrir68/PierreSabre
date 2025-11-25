package personnages;

public class Humain {
	private String name;
	private String favDrink;
	private int money;
	

	public Humain(String name, String favDrink, int money) {
		this.name = name;
		this.favDrink = favDrink;
		this.money = money;
	}

	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	private void parler(String message) {
		System.out.println(message);
	}
	
	public void direBonjour() {
		parler("Bonour! Je m'appelle "+this.name+" et j'aime boire du "+this.favDrink);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+this.favDrink+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(this.money>prix) {
			parler("J'ai "+this.money+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			this.money-=prix;
		}else {
			parler("Je n'ai plus que "+this.money+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	
	private void gagnerArgent(int gain) {
		this.money+=gain;
	}
	private void perdreArgent(int perte) {
		this.money-=perte;
	}
	
}

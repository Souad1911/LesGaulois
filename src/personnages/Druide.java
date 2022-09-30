package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public Druide(String nom, int effetPotionMin, int effetpotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler ("Bonjour, je suis le druide"+ nom + "et ma potion peur aller d'une force "+ effetPotionMin + "à"+ effetPotionMax+ "." );
	}
	private void parler(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getNom() {
		return nom;
	}
}
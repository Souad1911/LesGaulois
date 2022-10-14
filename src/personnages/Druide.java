package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	public Druide(String nom, int effetPotionMin, int effetpotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler ("Bonjour, je suis le druide"+ nom + "et ma potion peur aller d'une force "+ effetPotionMin + "à"+ effetPotionMax+ "." );
	}
	private void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		
	}
	public String getNom() {
		return nom;
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
		}
	public void preparerPotion() {
		Random random = new Random ();
		int forceP = random.nextInt(effetPotionMax);
		if (forceP>7) {
			System.out.println( "J'ai préparé une super potion de force" );
		}else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force");
		}
		
		
	}
	public static void main(String[] args) {
		Druide Panoramix =new Druide ("Panoramix",5,10);
	}

}
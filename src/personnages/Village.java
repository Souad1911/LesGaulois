package personnages;

public class Village {
	private String nom;
	private Chef chef ;
	private Gaulois[]villageois ;
	private int nbVillageois =0;


	public Village(String nom , int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];
		
	}


	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}

	public Gaulois trouverHabitant (int v) {
		return villageois[v];
	}
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[this.nbVillageois]=gaulois ;
		this.nbVillageois++;
		
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+ chef.getNom()+"vivent les légendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			villageois[i].getNom();
			
		}
	
	}
	public static void main(String[] args) {
		Village village ;
		village=new Village ("villagedesIrreductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef Abraracourcix;
		Abraracourcix= new Chef ("Abraracourcix", 6 , village);
		village.setChef(Abraracourcix);
		Gaulois asterix;
		asterix =new Gaulois ("Asterix" , 8);
		village.ajouterHabitant(asterix);
		village.afficherVillageois();
		Gaulois Obelix;
		asterix =new Gaulois ("obelix" , 25);
		 
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		
		
		
	}

}

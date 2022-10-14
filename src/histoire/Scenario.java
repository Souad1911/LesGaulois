package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix=new Gaulois ("asterix",8);
		Romain minus =new Romain ("minus",6);
		asterix.parler( "« bonjour à tous »");
		minus.parler(" « UN GAU... UN GAUGAU...»");
		for(int i=0; i<3;i++) {
			asterix.frapper(minus);
		}

	}

}

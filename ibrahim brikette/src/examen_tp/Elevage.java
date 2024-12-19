package examen_tp;

public class Elevage {
	private static final int NBMAXV=200;
	private Volaille[] volailles;
	private int compteur;
	public Elevage() {
		volailles=new Volaille[NBMAXV];
		compteur=0;
		
	}
	public void ajouter(Volaille v) {
		if(compteur>NBMAXV) {
			System.out.println("desollé le tableau est pleine");
		}
		else {
			volailles[compteur++]=v;
		}
		
	}
	public Volaille[] envoyerAlAbattoir() {
		 Volaille[] v=new Volaille[NBMAXV];
		 int j=0;
		 int i=0;
		while(i<compteur) {
			if(volailles[i].assezGrosse()) {
				v[j]=volailles[i];
				j++;
				}
			i++;
		}
		return v;
		

	}
	public Volaille rechercher(int id) {
		Volaille v=null;
		for(int i=0;i<compteur;i++) {
			if(volailles[i].getNumIden()==id)
				v= volailles[i];
		}
		return v;
		
		
	}
	public void afficher() {
		for(int i=0;i<compteur;i++) {
			System.out.println(volailles[i].toString());
		}
	}
}

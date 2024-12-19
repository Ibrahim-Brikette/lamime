package examen_tp;

public abstract class Volaille {
	protected double poids;
	protected  int numIden;
	public Volaille(double poids, int numIden) {
		this.poids = poids;
		this.numIden = numIden;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public int getNumIden() {
		return numIden;
	}
	public void setNumIden(int numIden) {
		this.numIden = numIden;
	}
	public void changerPoids(double nouveauPoids) {
		poids=nouveauPoids;
	}
	public abstract double  calculerPrix();
	public abstract boolean assezGrosse();
	
}

package examen_tp;

public class Canard extends Volaille{
	private static final double prixKillo=1.2 ;
	private static final double poidAbatage=1.5;
	public Canard(double poids, int numIden) {
		super(poids, numIden);
	}
	@Override
	public double calculerPrix() {
		// TODO Auto-generated method stub
		return poids*prixKillo;
	}
	@Override
	public boolean assezGrosse() {
		// TODO Auto-generated method stub
		return poids>=poidAbatage;
	}
	@Override
	public String toString() {
		return "Canard [prixKillo=" + prixKillo + ", poids=" + poids + ", numIden=" + numIden + ", son prix="+ calculerPrix() + "]";
	}
	
	
	
	
	
	

}

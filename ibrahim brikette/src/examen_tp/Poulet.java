package examen_tp;

public class Poulet extends Volaille{ 
	private static final double prixKillo=1;
	private static final double poidAbatage=1.2;

	public Poulet(double poids, int numIden ) {
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
		return "Poulet [prixKillo=" + prixKillo + ", poids=" + poids + ", numIden=" + numIden + ", son prix="+ calculerPrix() + "]";
	}
	
	
}

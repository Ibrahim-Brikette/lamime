package examen_tp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volaille p1=new Poulet(1.5, 10);
		System.out.println(p1.assezGrosse());
		Volaille p2=new Poulet(2, 15);
		System.out.println(p2.assezGrosse());

		Volaille c1=new Canard(1,10);
		System.out.println(c1.assezGrosse());

		Volaille c2=new Canard(1,15);
		System.out.println(c2.assezGrosse());

		Elevage test=new Elevage();
		test.ajouter(p1);
		test.ajouter(p2);
		test.ajouter(c1);
		test.ajouter(c2);
		test.afficher();
		System.out.println("Voici les volailles qu'on peut le manger");
		
		for(int i=0;i<test.envoyerAlAbattoir().length;i++) {
			if(test.envoyerAlAbattoir()[i]!=null)
				System.out.println(test.envoyerAlAbattoir()[i].toString());
		}
	}

}

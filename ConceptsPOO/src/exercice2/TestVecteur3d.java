package exercice2;

public class TestVecteur3d {

	public static void main(String[] args) {
		Vecteur3d v=new Vecteur3d(0,0,1);
		Vecteur3d u=new Vecteur3d(1,1,0);
		Vecteur3d r;
		System.out.println("Coordonnées de v:");
		v.afficher();
		System.out.println("Norme de v:");
		double nV=v.norme();
		System.out.println(nV);
		
		System.out.println("------------------------------");
		
		System.out.println("Coordonnées de u:");
		u.afficher();
		System.out.println("Norme de u:");
		double nU=u.norme();
		System.out.println(nU);
		
		System.out.println("-------------------------------");
		r=Vecteur3d.somme(v, u);
		System.out.println("Coordonnées de u+v:");
		r.afficher();
		System.out.println("Norme u+v:");
		double nUV=r.norme();
		System.out.println(nUV);

	}

}

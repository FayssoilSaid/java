package exercice4;

public class TestTriangle {

	public static void main(String[] args) {
		Point A=new Point(1,2);
		Point B=new Point(2,1);
		Point C=new Point(0,0);

		Triangle t1=new Triangle(A,B,C);
		
		System.out.println("--------------------------");
		t1.afficher();
		double pt1=Math.round(t1.calculerPerimetre());
		System.out.println("Le perimetre du triangle t1: "+pt1);
		double[] tab = t1.getAbscissesSommets();
		System.out.println("Les abscisse des trois sommets: ");
		for(int i=0;i<3;i++) {
			System.out.println(tab[i]);
		}
		
		
	}

}
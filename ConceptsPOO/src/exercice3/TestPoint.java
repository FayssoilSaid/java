package exercice3;

public class TestPoint {

	public static void main(String[] args) {
		Point p1=new Point(1,0);
		Point p2=new Point(0,2);
		System.out.println("point p1:");
		p1.afficher();
		System.out.println("point p2:");
		p2.afficher();
		System.out.println("point le plus éloigner:");
		Point p=Point.maxNorme(p1, p2);
		p.afficher();
		
	}

}

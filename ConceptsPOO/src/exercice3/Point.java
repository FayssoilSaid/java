package exercice3;

class Point {
	double x,y;//abs et ordonnée
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void afficher() {
		System.out.println("Coordonnées "+x+" "+y);
	}
	public static Point maxNorme(Point p1, Point p2) {
		double n=Math.sqrt(Math.pow(p1.x, 2)+Math.pow(p1.y, 2));
		double m=Math.sqrt(Math.pow(p2.x, 2)+Math.pow(p2.y, 2));
		return (n>=m)?p1:p2;//operateur conditionnels
	}
}
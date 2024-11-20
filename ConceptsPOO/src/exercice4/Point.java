package exercice4;

public class Point {
	private double x,y;
	static int cpt=0;
	int num;
	public Point() {
		this.x=Math.random()*10;
		this.y=Math.random()*10;
	}
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
		this.num=++cpt;
	}
	public Point(Point p) {
		this(p.x,p.y);
	}
	public void afficher() {
		System.out.println("Coordonnées "+this.x+" "+this.y);
	}
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
	}
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
	}
	public Point symetrique() {
		return new Point(-this.x,-this.y);
	}
	public static String nbr_Point() {
		return ("Nombre de point créer est: "+cpt);
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
}

package exercice4;

public class Triangle {
	Point A,B,C;
	public Triangle(Point A,Point B,Point C) {
		this.A=A;
		this.B=B;
		this.C=C;
	}
	public Triangle(Triangle t) {
		this.A=t.A;
		this.B=t.B;
		this.C=t.C;
	}
	public void afficher() {
		System.out.println("Les sommets du triangle");
		this.A.afficher();
		this.B.afficher();
		this.C.afficher();
	}
	public double calculerPerimetre() {
		return this.A.distance(this.B)+this.A.distance(this.C)+this.B.distance(this.C);
	}
	public void setA(double x,double y) {
		this.A.setX(x);
		this.A.setY(y);
	}
	public void deplacerA(double dx,double dy) {
		this.A.setX(this.A.getX()+dx);
		this.A.setY(this.A.getY()+dy);
	}
	public Point[] getSommets() {
		Point[] tabSommets= {this.A,this.B,this.C};
		return tabSommets;
	}
	public double[] getAbscissesSommets() {
		double[] tabAbsSomt=new double[3];
		Point[] tabSomt = this.getSommets();
		for(int i=0;i<3;i++) {
			tabAbsSomt[i]=tabSomt[i].getX();
		}
		return tabAbsSomt;
	}
}

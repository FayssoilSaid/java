package exercice1;

public class Point {
	double abs;
	char nom;
	public Point(char nom,double abs) {
		this.nom=nom;
		this.abs=abs;
	}
	public void afficher() {
		System.out.println("Le point \""+this.nom+"\" à pour abscisse "+this.abs);
	}
	public void deplacer(double dx) {
		this.abs+=dx;
	}
}

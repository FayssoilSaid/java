package exercice2;

class Vecteur3d {
	double x,y,z;
	public Vecteur3d(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void afficher() {
		System.out.println("("+this.x+","+this.y+","+this.z+")");
	}
	public double norme() {
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2)+Math.pow(this.z, 2));
	}
	public static Vecteur3d somme(Vecteur3d v1,Vecteur3d v2) {
		return new Vecteur3d(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
	}
}

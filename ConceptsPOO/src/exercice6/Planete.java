package exercice6;

public class Planete {	
	private String nom;
	private double r;
	private int id;
	private static int cpt;
	public Planete(String nom,float r) {
		this.nom=nom;
		this.r=r;
		this.id=++cpt;
	}
	public boolean plusGrande(Planete p) {
		return p.r>r;
	}
	public String getNom() {
		return nom;
	}
	public double getR() {
		return r;
	}
	public int getId() {
		return id;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setR(double r) {
		this.r=r;
	}
	
	//méthode qui permet d'afficher une planete
	@Override
	public String toString() {
		return "Planète {ID="+id+", Nom='"+nom+"', Rayon="+r+"}";
	}
	
}

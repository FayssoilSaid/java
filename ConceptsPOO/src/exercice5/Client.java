package exercice5;

public class Client {
	private String nom,cin;
	public Client(String nom,String cin) {
		this.nom=nom;
		this.cin=cin;
	}
	public void afficher() {
		System.out.println("Nom: "+this.nom);
		System.out.println("CIN: "+this.cin);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
}

package exercice5;

public class Compte {
	private double solde;
	private Client proprietaire;
	private static int compteur=0;
	int numero;
	public Compte(double solde,Client proprietaire) {
		this.solde=solde;
		this.proprietaire=proprietaire;
		this.numero=++compteur;
	}
	public Compte(Compte autreCompte) {
		this(autreCompte.solde,autreCompte.proprietaire);
	}
	public void afficher() {
		System.out.println("Propriétaire du compte numéro: "+this.numero);
		this.proprietaire.afficher();
		System.out.println("Solde de compte: "+this.solde+" DH");
	}
	public void deposer(double mt) {
		if(mt>0) {
			this.solde+=mt;
			System.out.println("Dépot de "+mt+" DH éffectuer, nouveau solde: "+this.solde+" DH");
		}else {
			System.out.println("Montant invalide pour le dépot.");
		}
	}
	public void retirer(double mt) {
		if(this.solde>=mt && mt>0) {
			this.solde-=mt;
			System.out.println("Retrait de "+mt+" DH effectué, nouveau solde: "+this.solde+" DH");
		}else {
				System.out.println("Montant invalide pour le rétrait ou votre solde est insuffisant.");
			}
		}

	public void transfererVers(double mt,Compte c) {
		if(this.solde>=mt && mt>0){
			this.retirer(mt);
			c.deposer(mt);
			System.out.println("Transfert de "+mt+" DH effectué vers le compte numero: "+c.numero);
		}else{
			if(this.solde<mt){
				System.out.println("Solde insuffisant pour transfert du montant de "+mt+" DH demander.");
				System.out.println("Vous avez "+this.solde+" DH dans votre compte.");
			}else{
				System.out.println("Montant invalide pour le transfert ou solde insuffisant.");
			}
		}
	}
	public double differenceSoldes(Compte c) {
		return Math.abs(this.solde-c.solde);
	}
	//permutation de deux compte c1 et c2
}

package exercice5;

public class Compte {
	private final double MONTANT_MIN_RETIRABLE=100;
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
		if(this.solde>=mt && mt>=this.MONTANT_MIN_RETIRABLE) {
			this.solde-=mt;
			System.out.println("Retrait de "+mt+" DH éffectuer, nouveau solde: "+this.solde+" DH");
		}else {
			if(this.solde<mt) {
				System.out.println("Votre solde est insuffisant.");
			}else {
				if(mt>0) {
					System.out.println("Vous ne pouvez pas rétirer moins de "+this.MONTANT_MIN_RETIRABLE+" DH");					
				}else {
					System.out.println("Montant invalide pour le rétrait.");
				}
			}
		}
	}
	public void transfererVers(double mt,Compte c) {
		this.retirer(mt);
		c.deposer(mt);
	}

}

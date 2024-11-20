package exercice5;

public class TestCompte {

	public static void main(String[] args) {
		//création des clients
		Client client1=new Client("Fayssoil","D007930U");
		Client client2=new Client("Ammar","M007930K");
		
		//création des comptes
		Compte compte1=new Compte(0,client1);
		Compte compte2=new Compte(0,client2);
		
		//afficher les comptes
		System.out.println("------------------");
		compte1.afficher();
		System.out.println("------------------");
		compte2.afficher();
		
		//Dépot
		System.out.println("------------------");
		compte1.deposer(2000);
		//Retrait	
		System.out.println("------------------");
		compte1.retirer(500);
		//Transfert
		System.out.println("------------------");
		compte1.transfererVers(500, compte2);
		//Différence des soldes
		System.out.println("------------------");
		double diffSolde = compte1.differenceSoldes(compte2);
		System.out.println("La diffrence de solde de compte "+compte1.numero+" et de compte "+compte2.numero+" est: "+diffSolde);
		//Permutation des comptes
		System.out.println("------------------");
		//Afficher les comptes après permutation

	}

}

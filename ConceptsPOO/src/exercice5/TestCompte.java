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
		compte1.retirer(2000);
		//Transfert
		System.out.println("------------------");
		//Différence des soldes
		System.out.println("------------------");
		//Permutation des comptes
		System.out.println("------------------");
		//Afficher les comptes après permutation

	}

}
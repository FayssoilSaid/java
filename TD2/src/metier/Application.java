package metier;

public class Application {
	public static void main(String[] args) {
		Compte c1 = new Compte(0000001,0);
		c1.setSolde(1000);
		System.out.println("Informations de votre compte: "+c1);
	}
}

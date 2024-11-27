
public interface Figure {
	public void afficher();
	public float perimetre(Figure obj);
}
class Carre implements Figure{
	String nom;
	float p=2;
	public void afficher() {
		System.out.println("carre");
	}
	public float perimetre(Figure obj) {
		return p;
	}
}
class Triangle implements Figure{
	String nom;
	float p=2;
	public void afficher() {
		System.out.println("carre");
	}
	public float perimetre(Figure obj) {
		return p;
	}
}
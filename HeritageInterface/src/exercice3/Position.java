package exercice3;

public class Position {
	private double x,y;
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Position() {
		this.x = Math.round(Math.random())/100.0;
		this.y = Math.round(Math.random())/100.0;
	}
	
	public void goNord() {
		this.y++;
	}
	
	public void goEst() {
		this.x++;
	}
	public void goSud() {
		this.y--;
	}
	
	public void goOuest() {
		this.x--;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
}

class Robot extends Position{
	Position pos;
	String nom;
	private String dir;//"Nord","Est",Sud et "Ouest"
	private int num;
	public static int cpt;
	
	public Robot() {
		super();
		this.nom = "RobotCOP";
		this.dir = "Nord";
		this.num = ++cpt;
	}
	
	public Robot(Position pos, String nom, String dir) {
		this.pos = pos;
		this.nom = nom;
		this.dir = dir;
	}
	
	public void afficher() {
		System.out.println("Propriété du robot numéro:"+this.num);
		System.out.println("Nom: "+this.nom);
		if(this.pos != null) {
			System.out.println("Position: ("+this.pos.getX()+","+this.pos.getY()+")");
		}else {
			System.out.println("Position: ("+super.getX()+","+super.getY()+")");
		}
		System.out.println("Direction: "+this.dir);
	}
	
	public String getDir() {
		return this.dir;
	}
	
	public void setDir(String dir) {
		this.dir = dir;
	}
}

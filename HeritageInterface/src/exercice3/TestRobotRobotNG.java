package exercice3;

public class TestRobotRobotNG {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Position p1 = new Position(2,3);
		Robot r2 = new Robot(p1,"RobotSop","Sud");
		r1.afficher();
		r2.afficher();
	}

}
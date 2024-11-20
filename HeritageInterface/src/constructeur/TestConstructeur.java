package constructeur;

public class TestConstructeur {

	public static void main(String[] args) {
		B1 b1 = new B1(12);
		B1 b2 = new B1();
		B1 b3 = new B1("POO");
		System.out.println(b1.x+"/"+b2.x+"/"+b3.x);
	}

}

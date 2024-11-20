package constructeur;

class A1 {
	public int x;
	
	public A1() {
		x = 1;
	}
	
	public A1(int y) {
		x = y;
	}
}

 class B1 extends A1{
	public B1() {
	}
	
	public B1(int i) {
		this();
		x=x*i;
	}
	
	public B1(String s) {
		super(17);
		x--;
	}
}

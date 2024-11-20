package classeObjet;

class A {
	public String f(B obj) {
		return ("A et B");
	}
	public String f(A obj) {
		return("A et A");
	}
}

class B extends A{
	public String f(B obj) {
		return ("B et B");
	}
	public String f(A obj) {
		return("B et A");
	}
}


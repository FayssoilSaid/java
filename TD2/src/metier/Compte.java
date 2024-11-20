package metier;

public class Compte {
	private int code;
	private float solde;
	
	public Compte(int c, float a) {
		code = c;
		solde = a;
	}
	
	public void verser(float mt) {
		solde+=mt;
	}
	
	public void retirer(float mt) {
		solde-=mt;
	}
	public String toString() {
		return "code = "+code+" solde = "+solde;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
}

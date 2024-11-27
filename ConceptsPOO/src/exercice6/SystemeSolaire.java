package exercice6;

public class SystemeSolaire {
	
	private Planete[] TP;
	private int indP;

	
	public SystemeSolaire() {
		TP=new Planete[9] ;
		indP=0;
	}
	
	public void ajouterPlanete(String nom,float r) {
		if(indP<TP.length) {
			TP[indP++]=new Planete(nom,r);
		}else { 
			System.out.println("Le système solaire est plein, impossible d'ajouter des nouvelle planetes.");
		}	
	}
	public Planete getPlanete(String nom) {	
			for(int i=0;i<indP;i++) {
				if(TP[i]!=null && TP[i].getNom().equals(nom)) {
					return TP[i];
				}
			}
			return null;
	}
	public String getNom(int id) {
		if(id>0 ) {
			for(int i=0;i<indP;i++) {
				if(TP[i]!=null && TP[i].getId()==id) {
					return TP[i].getNom();
				}
			}
			return null;
		}
		return null;		
	}
	public void setNom(int id,Planete p) {
		if(p!=null && id>0) {
			for(int i=0;i<indP;i++) {
				if(TP[i]!=null && TP[i].getId()==id) {
					TP[i].setNom(p.getNom());
					return;
				}
			}
			System.out.println("Aucune planète avec cet ID n'a été trouvée.");
		}else if(p==null) {
			System.out.println("La planète passé en paramètre est null.");
		}else {
			System.out.println("Aucune planète avec un ID inferieur ou égale 0.");
		}
	}
	public void permuterNoms(Planete p, int id) {
		if(p!=null && id>0) {
			for(int i=0;i<indP;i++) {
				if(TP[i]!=null && TP[i].getId()==id) {
					String tmp=TP[i].getNom();
					TP[i].setNom(p.getNom());
					p.setNom(tmp);
					return;
				}
			}
			System.out.println("Aucune planète avec cet ID n'a été trouvée.");
		}else if(p==null) {
			System.out.println("La planète passé en paramètre est null.");
		}else {
			System.out.println("Aucune planète avec un ID inferieur ou égale 0.");
		}
	}
	public void setR(int id) {
		if(id>0 ) {
			for(int i=0;i<indP;i++) {
				if(TP[i]!=null && TP[i].getId()==id) {
					TP[indP-1].setR(TP[i].getR());
					return;
				}
			}
			System.out.println("Aucune planète avec cet ID n'a été trouvée.");
		}else {
			System.out.println("Aucune planète avec un ID inferieur ou égale 0.");
		}
		
	}
}

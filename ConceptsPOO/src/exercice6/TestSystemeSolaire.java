package exercice6;

public class TestSystemeSolaire {

	public static void main(String[] args) {
		SystemeSolaire s=new SystemeSolaire();
		//Ajouter des planètes au système solaire
		s.ajouterPlanete("Terre",6378);
		s.ajouterPlanete("Venus",6080);
		s.ajouterPlanete("Jupiter",71500);
		s.ajouterPlanete("Mars",3400);
		
		//Afficher une planète par son nom dans la système solaire
		Planete terre=s.getPlanete("Terre");
		System.out.println("Planète trouvée: "+terre);
		
		//Modifier le nom d'une planète par un ID 
		s.setNom(1,new Planete("Mercure",2440));
		System.out.println("Nom de la planète avec ID=1 :"+s.getNom(1));
		
		//Permuter les noms des deux planète
		Planete mars=s.getPlanete("Mars");
		s.permuterNoms(mars, 2);
		System.out.println("Nom de la planète Mars après permutation: "+mars.getNom());
		System.out.println("Nom de l'ID=2 après permutation: "+s.getNom(2));
		
		//Modifier le rayon d'une palnète
		System.out.println("Le rayon de la dernière planète (Mars) avant modification: "+mars.getR());
		s.setR(3);
		System.out.println("Le rayon de la dernière planète (Mars) après modification: "+mars.getR());
	}
}

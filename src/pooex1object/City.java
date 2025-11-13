package pooex1object;

public class City {
	
	// attributs
	public String ville;
	public String pays;
	public int nbHabitants;
	
	static int nbObjects = 0; //Static because we need to be able to use it anywhere
	
	//count number of objects instanced
    {
        nbObjects ++;
    }
	
	//constructeur
	public City (String ville, String pays, int nbHabitants) {
		this.ville = ville;
		this.pays = pays;
		this.nbHabitants = nbHabitants;
		
	}
	
	/*public City (String ville, int nbHabitants) {
		this.ville = ville;
		this.nbHabitants = nbHabitants;
	}*/
	
	// accesseurs : Getter / Setter
	
	public String getVille () {
		return ville;
		
	}
	public void setVille(String ville) {
		this.ville = ville;
		
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		if (nbHabitants < 0) {
			System.out.println("le nombre d'habtants ne peut pas être négatif");
			this.nbHabitants = 0;
		} else {
			this.nbHabitants = nbHabitants;

		}
	}
	
	/*public void display() {
		System.out.println("Ville de " + this.ville+ 
							" en "+ this.pays+ " ayant "+ 
							this.nbHabitants+" habitants");
		
	}*/
	
	public String toString() {
		if (this.nbHabitants > 0) {
			return "Ville de " + this.ville+ 
					" en "+ this.pays+ " ayant "+ 
					this.nbHabitants+" habitants";
			
		} else {
			return "Ville de " + this.ville+ 
					" en "+ this.pays;
		}
		

		
		
	}
	
	
}

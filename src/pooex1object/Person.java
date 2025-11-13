package pooex1object;

public class Person {

	public String nom;
	public String prenom;
	public int age;
	public String adresse;
	public City city;
	
	// constructeur 
	public Person (String nom, String prenom, int age, String adresse, City city) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.city = city;
	}
	
	//accesseurs : Getter / Setter
	public String getNom() {
		return nom;
	}
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getAge () {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse (String adresse) {
		this.adresse = adresse;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}
	

	// To String 
		public String toString() {
			//We only return the ones with Paris in address or when born in france

				return " Person [Nom : " + this.nom+ "] [Prénom : " + 
						this.prenom + "] [age : "+ this.age + 
						"] [Adresse : " + this.adresse 
						+ "] [Ville de naissance : "+ city+ "]" ;
					

		}
}

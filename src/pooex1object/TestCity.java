package pooex1object;

public class TestCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City Toulouse = new City ("Toulouse", "France", 450000);
		City Paris = new City ("Paris", "France", 1200000);
		City Tokyo = new City ("Madrid", "Espagne", 3000000 );
		
		System.out.println(Toulouse);
		Toulouse.nbHabitants += 20000;
		
		
		/*Toulouse.display();
		Paris.display();
		Tokyo.display();*/
		
		System.out.println(Toulouse);
		System.out.println("Nombre d'objets : "+ City.nbObjects);
		
	}

}

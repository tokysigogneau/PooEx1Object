package pooex1object;

public class TestCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City toulouse = new City ("Toulouse", "France", 450000);
		City paris = new City ("Paris", "France", 1200000);
		City madrid = new City ("Madrid", "Espagne",0);
		
		System.out.println(toulouse);
		toulouse.nbHabitants += 20000;
		System.out.println();
		
		/*toulouse.display();
		paris.display();
		madrid.display();*/
		
		System.out.println(toulouse);
		System.out.println(paris);
		System.out.println(madrid);
		System.out.println("Nombre d'objets : "+ City.nbObjects);
		
	}

}

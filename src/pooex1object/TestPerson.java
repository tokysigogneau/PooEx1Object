package pooex1object;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person toto = new Person ("Mwangani", "Toto", 43, "24 rue Jsp Ou", new City ("Toulouse","France",125400)) ;
		Person marie = new Person ("Charlemagne", "Marie", 21, "2 boulevard Tresbon", null);
		
		
		System.out.println(toto);
		System.out.println(marie);
	}

}

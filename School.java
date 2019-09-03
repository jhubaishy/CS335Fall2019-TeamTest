package testing;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student scoop = new Student();
		Teacher doop = new Teacher();
		
		scoop.setBirthDate(10);
		System.out.println(scoop.getBirthDate());
		System.out.println(scoop.toString());
		doop.setBirthDate(11);
		
		System.out.println(doop.getBirthDate());
		System.out.println(doop.toString());
		
	}

}

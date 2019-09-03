package testing;

public class Teacher implements Person{

	int birthDate;
	int birthMonth;
	int birthYear;
	String name;
	
	
	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDOB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(){
		return "I am a teacher";
	}
	
	
}

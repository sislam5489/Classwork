package Person;

public class Teacher extends Person{

	private String birthdate;
	private int date;
	public Teacher(String birthdate)
	{
		this.birthdate = birthdate;
	}
	public String greeting()
	{
		return "Good Morning Ladies and Gentlemen";
	}
	

}

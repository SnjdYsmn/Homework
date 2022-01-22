package hw4Q2JavaVariables;

public class AboutMe {

	// variables declared
	public String person_name;
	public byte person_age;
	public double person_height;
	public short person_weight;
	public int person_phoneNumber;
	public float person_grade;
	public long person_yealySalary;
	public char person_sex;
	public boolean person_us_citizen;

	// Constructor declared
	public AboutMe() {
		System.out.println("This is all about me: ");
	}

	// Method Implemented
	public void aboutMe() {
		System.out.println("Name: " + person_name + "\nAge: " + person_age + "\nHeight: " + person_height + "Weight: "
				+ person_weight + "\nPhoneNumber: " + person_phoneNumber + "\ngrade: " + person_grade + "Yearly Sallary: "
				+ person_yealySalary + "\nSex: " + person_sex + "\nCitizen: " + person_us_citizen);

	}

}


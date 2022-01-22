package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); // Constructor Initialized
		// Variable initialized
		me.person_name = "Sanjida";
		me.person_age = 45;
		me.person_height = 5;
		me.person_weight = 130;
		me.person_phoneNumber = 2065553249;
		me.person_grade = 3.2f;
		me.person_yealySalary = 500033342;
		me.person_sex = 'F';
		me.person_us_citizen = true;
		me.aboutMe(); // Method initialized

		System.out.println("\n-------------------------------------------\n");
		AboutMe alex = new AboutMe();
		alex.person_name = "Alex";
		alex.person_age = 45;
		alex.person_height = 5;
		alex.person_weight = 130;
		alex.person_phoneNumber = 2065553249;
		alex.person_grade = 3.2f;
		alex.person_yealySalary = 500033342;
		alex.person_sex = 'F';
		alex.person_us_citizen = true;
		alex.aboutMe();
	}

}

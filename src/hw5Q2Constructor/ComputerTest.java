package hw5Q2Constructor;


public class ComputerTest{

	// This is default constructor;
	String brand;
	String model;
	String operating_system;
	boolean madeInUSA;
	char grade;
	int price; 
	
	// constructor
	public ComputerTest()
	{
	
		System.out.println("Default constructor is called from computerTest class");
			
	}
	
	// This is parameterized constructor
	public ComputerTest(String brandName, String modelName, String OS, boolean yesNo, char gradetype, int computerprice )
	{
		System.out.println("paramiterized constructor is called computerTest");
		System.out.println("The brand of the computer is: " + brandName);
		System.out.println("The model of the computer is: " + modelName);
		System.out.println("The operating system of the computer is: " + OS);
		System.out.println("The madeInUSA of the computer is: " + yesNo);
		System.out.println("The grade of the computer is: " + gradetype);
		System.out.println("The price of the computer is: " + computerprice);
			
	}
	
		
	public static void main(String[] args) {
		
		// Object creation with default constructor
		Computer HP =  new Computer();

		HP.brand = "HP-Envy";
		HP.model = "XYZ";
		HP.operating_system = "Window";
		HP.madeInUSA = true;
		HP.grade = 'C';
		HP.price = 5000;
		
		System.out.println("The brand of the computer is: " + HP.brand);
		System.out.println("The model of the computer is: " + HP.model);
		System.out.println("The operating system of the computer is: " + HP.operating_system);
		System.out.println("The madeInUSA of the computer is: " + HP.madeInUSA);
		System.out.println("The grade of the computer is: " + HP.grade);
		System.out.println("The price of the computer is: " + HP.price);
		

		// Object creation with parameterized constructor
		Computer Lenovo = new Computer("Lenovo", "Thinkpad", "Linux", false, 'A', 8000);
		ComputerTest Lenovo2 = new ComputerTest("Lenovo", "Thinkpad", "Linux", false, 'A', 8000);
	 


	 }
}



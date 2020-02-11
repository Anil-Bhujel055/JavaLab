class Construct
{
	int roll;
	String name;
	char grade;

// Default constructor
	Construct()
	{
		roll = 5;
		grade = 'A';
	}

// parameterized constructor
	Construct(String name, char grade)
	{
		this.name = name;
		this.grade = grade;
	}



	void displayName()
	{
		System.out.println("Name: " + name);
	}

	void displayRoll()
	{
		System.out.println("Roll: " + roll);
		System.out.println("Grade: " + grade);
	}
}

class ConstructDemo
{
	public static void main(String[] args)
	{
		Construct obj = new Construct();
		Construct ob = new Construct("Anil", 'E');
			ob.displayName();
		
			ob.displayRoll();
	} 
}
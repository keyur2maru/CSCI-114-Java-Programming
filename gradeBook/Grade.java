
public abstract class Grade implements Name {   //creating abstract class so using keyword "abstract" 
												//abstract class providing implementation of interface so keyword "implements"
 int theory;									//referring to the point that abstract class can behave as interface but vice versa is not possible
 private int practical; 		//abstract class can also have private variables

	String firstName;
	String lastName;

public void Results(int a, int b)  //interface cannot have method body inside it but method body has to be inside the class which implements it 
{									//in the case of abstract class, it can have method's body inside it too which is here
	theory = a;
	practical = b;
	
	System.out.println("Your theory grade is " + theory);
	System.out.println("Your practical grade is " + practical);
}

public void fullName(String a, String b) {   //interface method implemented here
	this.firstName = a;
	this.lastName = b;
	System.out.println("Student's first name is " + firstName);
	System.out.println("Student's last name is " + lastName);
}

	public abstract void overallGrade(int x, String y); //abstract class method declaration  
														////referring to the point of complete abstraction which also can be achieved on abstract class

}

interface Name { 						//interface with only method declaration (method starts at line 18) 
void fullName(String a, String b); 		////referring to the point of complete abstraction only, cannot have body of method in the interface itself 
}
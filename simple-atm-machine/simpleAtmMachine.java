import java.util.Scanner;

public class simpleAtmMachine {
	private static float balance = 0;
	
	private static String s_username = "000114";
	private static String s_password = "114";
	
	public static void main(String args[])
	{
				Login();
		while (true) { 
		ATM();
		}
	}


public static boolean validate(String username, String password)	
{
    if ( username.equals(s_username) && password.equals(s_password))
        return true;
    else
        return false;
}
public static String getUserName()
{
    System.out.println("Plase enter your account number:");
    Scanner input = new Scanner(System.in);
    String username = input.nextLine();
    return username;
}
public static String getPassword()
{
    System.out.println("Plase enter your password:");
    Scanner input = new Scanner(System.in);
    String password = input.nextLine();
    return password;
}

public static void Login() {
int attempt = 0;
while (attempt <= 2) {
String username = getUserName();
String password = getPassword();
switch (attempt) {
case 0:
   System.out.println("\n(1st Attempt)");
   break;
case 1:
   System.out.println("\n(2nd Attempt)");
   break;
case 2:
   System.out.println("\n(3rd Attempt)");
   break;
}
System.out.println("===========================================\n");
if ( validate(username, password)==false ) {
if (attempt == 2)
    System.out.println("The account number and password doesn't match!\nPlease make sure you have the correct Account number and Password, and try again."); }
    else {
    	//System.out.println("Welcome to the Palomar CSCI114 ATM\n");
    break;
    }
attempt++;

}
System.exit(0);

}

public static void ATM()
{
	int choice;
	while (true) {
	System.out.println("Please choose one of the following:");
	System.out.println("1. Deposit Cash");
	System.out.println("2. Withdraw Cash");
	System.out.println("3. Print Statement");
	System.out.println("4. Exit");
	System.out.println("Your Choice:");
    Scanner input = new Scanner(System.in);
	choice = input.nextInt();
	System.out.println("===========================================\n");
	
	switch(choice) {
	
	case 1:
	float deposit;
	System.out.println("Please enter the amount of deposit in US dollars:\n (For example: 89.75)\n $:");
	deposit = input.nextFloat();
	balance = deposit + balance;
	System.out.println(""+deposit+" has been deposited into your account.\nThe current balance is: "+balance+"\n");
	break;
	
	case 2:
	float amount;
	
	System.out.println("Please enter the amount to withdraw in US dollars:\n (For Example: 89.75)\n $:");
	amount = input.nextFloat();
	do { 
	System.out.println("Input Error! Try again");
	}	while (amount < 0);
	//System.out.println("Input Error! Try again");
	do {
		System.out.println("You can't withdraw more than your total balance! Try again");
		
	} while (amount > balance);
	do {
		balance = balance - amount;
		System.out.println(""+amount+" has been withdrew from your account.\nThe current balance is: "+balance+"\n");
	} while (amount < balance && amount >= 1);
	
	
	
	case 3:
		String fname = "Keyur";
		String lname = "Maru";
		
		System.out.println("CSCI114 Bank\n");
		System.out.println("Name: "+lname+", "+fname+"");
		System.out.println("Account Number:"+s_username+"");
		System.out.println("===========================================\n");
	break;

	case 4:
	System.out.println("Thank you for banking with us! Please come back soon.\n");
	System.out.println("CSCI114 Bank\nMember of FDIC, Equal Housing Lender!");
	System.out.println("===========================================\n");
	System.exit(0);
	break;
	}
	
}
}
}
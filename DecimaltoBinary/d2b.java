import java.util.Scanner;
public class d2b { 
		public static void main(String[] args) {
			int sum = 0;
	      	    System.out.println("Please enter a number between 1 and 10:");
	      	    Scanner input = new Scanner(System.in);
        int number = input.nextInt();
      if (number < 1 || number > 10) {
    	  System.out.println("Wrong number!, the number must be between 1 and 10.");
			System.exit(0);

      }
      else
        for (int i=1; i <= number; i++) {
        	sum = sum + i;
        }
      System.out.println(sum);
}
}

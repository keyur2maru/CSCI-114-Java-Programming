import java.util.Scanner;
public class maru_assignment6 {
	  static int fib(int n) 
	    { 
	    if (n <= 1) 
	       return n; 
	    return fib(n-1) + fib(n-2); 
	    } 
	       
	    public static void main (String args[]) 
	    { 
	    int n = 1; 
	    for (int i = 0; i < n; i++) {
		    System.out.println(fib(n)); 
		  if (n<50) {  n++;
	    		    }
	    } 
	    }
}
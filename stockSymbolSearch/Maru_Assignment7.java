import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Maru_Assignment7 {
		public static void main(String[] args) throws Exception {
	    boolean restart = true;
		int found = 0;
        String line;

    	String location = "http://www.nasdaqtrader.com/dynamic/SymDir/nasdaqlisted.txt";
        URL nasdaq = new URL(location);
        	
        /* Copy From URL to Text File */
        BufferedReader in = new BufferedReader(new InputStreamReader(nasdaq.openStream()));
        FileWriter out = new FileWriter(args[0]);
        while((line = in.readLine()) != null ) 
        {
        	out.write(line + "\n");
        }

          
        while (restart) {
        	found = 0;
            String symbol = "null";
            String[] values = null;
     
        System.out.println("Please Enter a Stock Symbol to Search (Enter '0' to exit):");
        Scanner input = new Scanner(System.in);
     	symbol = input.nextLine();
     	symbol = symbol.toUpperCase();
     	if(symbol.compareTo("0") == 0) 	
     	{
     		  break;
     	}
    

     	BufferedReader in1 = new BufferedReader(new InputStreamReader(nasdaq.openStream()));
            while((line = in1.readLine()) != null ) 
            {
        		values = line.split(Pattern.quote("|"));
        			if(symbol.equals(values[0])) 
        			{
      	        	System.out.println("Found:\n" + "Symbol: " + values[0]);
      	        	System.out.println("Security Name: " + values[1]);
      	        	System.out.println("Market Category: " + values[2] + "\n");
      	        	found = 1; 
        			}
            }
        
            if (found == 0)
            System.out.println("Not found.\n");
        }
        out.close();	
	}
}

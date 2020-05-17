import java.net.*;
import java.io.*;
import java.util.*;

public class maru_assignment6 {
	    public static void main(String[] args) throws Exception {
	    	String location = "http://www.gutenberg.org/files/1952/1952-0.txt";
	        URL oracle = new URL(location);
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(oracle.openStream()));

	        String inputLine;
	        int lineCount = 0;
	        int wordCount = 0;
	        int characterCount = 0;
	        String[] array = new String[100000];
	        int[] count = new int[26];
	        char[] myarry;
	        char s1 = 'A';
	        char s2 = 'a';
	        int s1Index = 0;


	        while ((inputLine = in .readLine()) != null) {
	            characterCount += inputLine.length();
	            array[lineCount] = inputLine;
	            array[lineCount] = array[lineCount].toLowerCase();
	            myarry = array[lineCount].toCharArray();

	            for (int i = 0; i < myarry.length; i++) {
	                if (myarry[i] == 'a')
	                    count[0] = count[0] + 1;
	                else if (myarry[i] == 'b')
	                    count[1] = count[1] + 1;

	                else if (myarry[i] == 'c')
	                    count[2] = count[2] + 1;

	                else if (myarry[i] == 'd')
	                    count[3] = count[3] + 1;

	                else if (myarry[i] == 'e')
	                    count[4] = count[4] + 1;

	                else if (myarry[i] == 'f')
	                    count[5] = count[5] + 1;

	                else if (myarry[i] == 'g')
	                    count[6] = count[6] + 1;

	                else if (myarry[i] == 'h')
	                    count[7] = count[7] + 1;

	                else if (myarry[i] == 'i')
	                    count[8] = count[8] + 1;

	                else if (myarry[i] == 'j')
	                    count[9] = count[9] + 1;

	                else if (myarry[i] == 'k')
	                    count[10] = count[10] + 1;

	                else if (myarry[i] == 'l')
	                    count[11] = count[11] + 1;

	                else if (myarry[i] == 'm')
	                    count[12] = count[12] + 1;

	                else if (myarry[i] == 'n')
	                    count[13] = count[13] + 1;

	                else if (myarry[i] == 'o')
	                    count[14] = count[14] + 1;

	                else if (myarry[i] == 'p')
	                    count[15] = count[15] + 1;

	                else if (myarry[i] == 'q')
	                    count[16] = count[16] + 1;

	                else if (myarry[i] == 'r')
	                    count[17] = count[17] + 1;

	                else if (myarry[i] == 's')
	                    count[18] = count[18] + 1;

	                else if (myarry[i] == 't')
	                    count[19] = count[19] + 1;

	                else if (myarry[i] == 'u')
	                    count[20] = count[20] + 1;

	                else if (myarry[i] == 'v')
	                    count[21] = count[21] + 1;

	                else if (myarry[i] == 'w')
	                    count[22] = count[22] + 1;

	                else if (myarry[i] == 'x')
	                    count[23] = count[23] + 1;

	                else if (myarry[i] == 'y')
	                    count[24] = count[24] + 1;

	                else if (myarry[i] == 'z')
	                    count[25] = count[25] + 1;
	            }
	            lineCount++;
	            String[] wordList = inputLine.split("\\s+");
	            wordCount += wordList.length;
	        }
	        

	        try{    
	       FileWriter fw2=new FileWriter(args[0], false);    //false => overwrites, true => appends
	       String fileName = location.substring(location.lastIndexOf('/') + 1, location.length());
	       fw2.write("File Name, " + fileName + "\n");
	       fw2.write("Total Lines, # of total lines " + Integer.toString(lineCount) + "\n");  
	       fw2.write("Total Words, # of total words " + Integer.toString(wordCount) + "\n");  
	       fw2.write("Total Characters, # of total characters " + Integer.toString(characterCount) + "\n");  
	      for (int i = 0; i < count.length; i++) {
	           String gs = Character.toString(s1++);
	           String bs = Character.toString(s2++);
	         fw2.write(bs + "(" + gs + ")" + ", # of total " + bs + "(" + gs + ")" + "s " + count[i] + "\n");
	       }
	      

	        for (int i = 1; i < count.length; i++) {
	            if (count[i] > count[s1Index]) s1Index = i;
	        }

	        if (s1Index == 0)
	            s1 = 'A';
	        else if (s1Index == 1)
	            s1 = 'B';
	        if (s1Index == 2)
	            s1 = 'C';
	        else if (s1Index == 3)
	            s1 = 'D';
	        if (s1Index == 4)
	            s1 = 'E';
	        else if (s1Index == 5)
	            s1 = 'F';
	        if (s1Index == 6)
	            s1 = 'G';
	        else if (s1Index == 7)
	            s1 = 'H';
	        if (s1Index == 8)
	            s1 = 'I';
	        else if (s1Index == 9)
	            s1 = 'J';
	        if (s1Index == 10)
	            s1 = 'K';
	        else if (s1Index == 11)
	            s1 = 'L';
	        if (s1Index == 12)
	            s1 = 'M';
	        else if (s1Index == 13)
	            s1 = 'N';
	        if (s1Index == 14)
	            s1 = 'O';
	        else if (s1Index == 15)
	            s1 = 'P';
	        if (s1Index == 16)
	            s1 = 'Q';
	        else if (s1Index == 17)
	            s1 = 'R';
	        if (s1Index == 18)
	            s1 = 'S';
	        else if (s1Index == 19)
	            s1 = 'T';
	        if (s1Index == 20)
	            s1 = 'U';
	        else if (s1Index == 21)
	            s1 = 'V';
	        if (s1Index == 22)
	            s1 = 'W';
	        else if (s1Index == 23)
	            s1 = 'X';
	        if (s1Index == 24)
	            s1 = 'Y';
	        else if (s1Index == 25)
	            s1 = 'Z';
	        String lineLength = getlongestlineLength(array);

	        fw2.write("The most used character, " + s1 + "\n"); 
	        fw2.write("The length of longest line, " + lineLength.length() + "\n");
	        fw2.close();    
	        }catch(Exception e){System.out.println(e);
	        }   
	        System.out.println("Success...");    
	   
	    }   
	       
	        public static String getlongestlineLength(String [] array){
	            int size = array.length;
	            String longestline = array[0];

	            for(int i = 0; i <= 3; i++){
	                if(array[i].length() >  longestline.length()){
	                longestline = array[i];
	            }}

	            return longestline;
	        }
	        
	        
	    }


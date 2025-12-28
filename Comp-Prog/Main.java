
import java.io.*;
import java.util.StringTokenizer;

/*
 * First line = N, number of swaps
 * Each of the next N lines describe a step of the game and contain integers
 * a,b,g. Indicates shells a and b swapped by Bessy, and then Elsie guesseed shell g after swap was made
 * 
 * Output max number of points Elsie could have earned
 */

 public class Main {

    public static void main(String[] args) {
        BufferedReader f = new BufferedReader(new FileReader("task.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("task.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		

        int[] shells = {1,2,3};
        int initPos = 1;
        int numCorrect = 0;

        

        out.println(numCorrect);
		
		out.close();
		f.close();
	    System.exit(0);
    }


 }
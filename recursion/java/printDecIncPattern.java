/*package whatever //do not write package name here */

import java.io.*;
import java.util.ArrayList;

class GFG {
	public static void main (String[] args) {
		// print 5 4 3 2 1 1 2 3 4 5 6 like pattern for n = 5
		printPDI(8);
	}
	
	private static void printPDI(int n) {
	    if (n==0)
	        return;
	    System.out.print(n + " ");
	    printPDI(n-1);
	    System.out.print(n+ " ");
	}
}
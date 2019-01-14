/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n, i=0;
// 		int arr[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
// 		arr = new int[n];
// 		while(i<n) {
// 		    arr[i] = sc.nextInt();
// 		    i++;
// 		}

        printPattern(1,1,5);
		
	}
	
	private static void printPattern(int r, int c, int n) {
	    if ( r > n )
	        return;
	    if (c > r) {
	        System.out.println();
	        printPattern(r+1, 1, n);
	        return;
	    }
	    System.out.print("*");
	    printPattern(r, c+1, n);
	}
	
	
}
/*
    ARRAYS-WAVE PRINT COLUMN WISE
Take as input a two-d array. Wave print it column-wise.


Input Format:
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints:
Both M and N are between 1 to 10.
Output Format:
All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).

Sample Input:
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
 */

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        // take input
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        Sol ob = new Sol();
        
        ob.wavePatternColWise(arr, r, c);
        System.out.println();
        ob.wavePatternRowWise(arr, r, c);
    }
    
}

class Sol {
    public void wavePatternColWise(int arr[][], int r, int c) {
        // if col no is even up->down else down->up
        for(int i=0; i<c; i++) {
            if((i&1) == 1) {   // odd
                for(int j=r-1; j>=0; j--) {
                    System.out.print(arr[j][i]+", ");
                }
                
            } else {    // even
                for(int j=0; j<r; j++) {
                    System.out.print(arr[j][i]+", ");
                }
            }
        }
        System.out.print("END");
    }
    
    public void wavePatternRowWise(int arr[][], int r, int c) {
        
        
        // if row no is even left->right else right->left
        for(int i=0; i<r; i++) {
            if((i&1) == 1) {   // odd
                for(int j=c-1; j>=0; j--) {
                    System.out.print(arr[i][j]+", ");
                }
                
            } else {    // even
                for(int j=0; j<c; j++) {
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
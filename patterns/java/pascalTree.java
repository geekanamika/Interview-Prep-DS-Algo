import java.io.*;
import java.util.*;
import java.lang.Math;

class GFG {
    
    private static int[][] printPascal(int num) {
        
        int res[][] = new int[num][];
        int j = 0;
        res[0] = new int[1];
        res[0][0] = 1;
        res[1] = new int[2];
        res[1][0] = 1;
        res[1][1] = 1;
        for(int i=2; i<num; i++) {
            res[i] = new int[i+1];
            res[i][0] = 1;
            res[i][i] = 1;
            for(j=1; j<i; j++) {
                    res[i][j] = res[i-1][j-1] + res[i-1][j];
            }
        }
        return res;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res[][] = printPascal(num);
		int s=(2*num)-2;
		for(int i=0 ; i<num; i++, s-=2) {
		    // spaces
		    for(int k=0; k<s; k++) {
		        System.out.print(" ");
		    }
		    for(int j=0; j<res[i].length; j++) {
		        System.out.print(res[i][j] + "   ");
		    }
		    System.out.println();
		}
 		
	}
}
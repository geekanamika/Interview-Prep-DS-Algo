import java.io.*;
import java.util.*;
import java.lang.Math;

class GFG {
    
   private static int countSetBits(int num) {
        int c = 0;
        while(num!=0) {
            if((num & 1) == 1)
                c++;
            num = num >> 1;    
        }
        return c;
   }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int t = sc.nextInt();
		while(t > 0) {
		    t--;
		    n = sc.nextInt();
		    
		    System.out.println(countSetBits(n));
		}
 		
	}
}
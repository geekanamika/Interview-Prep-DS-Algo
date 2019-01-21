import java.io.*;
import java.util.*;
import java.lang.Math;

class GFG {
    
   private static int primeVisits(int a, int b) {
       if(a> b) {
           int temp = a;
           a = b;
           b = a;
       }
       boolean freq[] = new boolean[b+1];
       int p=2;
       int sq = 4;
       
       while(sq<=b) {
           
           while(sq<=b) {
               freq[sq] = true;
               sq+=p;
           }
           
           p++;
           while(true) {
               if(freq[p] == false)
                    break;
                p++;    
           }
           sq = p*p;
       }
       
       int beg = a > 2 ? a : 2;
       int c= 0;
       for(; beg<=b; beg++) {
           if(freq[beg] == false)
                c++;
       }
       return c;
   }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int t = sc.nextInt();
		while(t > 0) {
		    t--;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    System.out.println(primeVisits(a, b));
		}
 		
	}
}
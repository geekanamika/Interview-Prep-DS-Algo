import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long sumEvenFactors(int n){
        long sum = 0;
        for(int i = 1; i<= Math.sqrt(n); i++) {
            if((n%i == 0)) {
                if(i*i == n  && (i%2 ==0)) {
                    sum+=i;
                } else {
                    if (i%2 ==0)
                        sum+= i;
                    if(((n/i) %2) ==0)
                        sum+=(n/i);
                }
            }
        }
        return sum;
    }
    
	public static void main (String[] args) {
		int t;
		int num;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
		    t--;
		    num = sc.nextInt();
		    System.out.println(sumEvenFactors(num));
		}
	}
}
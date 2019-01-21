import java.util.*;
public class Main {
    
    static int gcd (int a, int b) {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);    
    }
    
    static long lcm(int a, int b) {
        long res = a*b;
        int g = gcd(a, b);
        return res/g;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(lcm(a,b));
    }
}
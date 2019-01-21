import java.util.*;
public class Main {
    
    static int gcd (int a, int b) {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);    
    }
    
    static int hcfArray(int arr[], int n) {
        int res = arr[0];
        
        for(int i = 1; i<n; i++) {
            res = gcd(arr[1], res);
        }
        return res;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		System.out.println(hcfArray(arr,n));
    }
}
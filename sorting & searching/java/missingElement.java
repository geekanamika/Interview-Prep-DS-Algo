import java.lang.*;
import java.util.*;
import java.io.*;

class GFG {
    
    private static int missingElement(int arr[]) {
        int i = 0;
        if (arr.length == 2)
            return (arr[0] + arr[1])/2;
        int diff = arr[1] - arr[0];
        for(i=0; i<arr.length-1; i++) {
            if ((arr[i+1] - arr[i]) < diff )
                diff = (arr[i+1] - arr[i]);
        }
        // diff is d now for ap
        for (i=0; i<arr.length-1; i++) {
            if ((arr[i+1] - arr[i]) != diff) {
                diff = arr[i]+diff;
                break;
            }
        }
        return diff;
        
    }
    
	public static void main (String[] args) {
		int t;
		int n, key;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
		    t--;
		    
		    n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    System.out.println(missingElement(arr));
		}
	}
}
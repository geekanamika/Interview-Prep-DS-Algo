import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        countingSort(arr, n);
    }
    
    private static void countingSort(int arr[], int n) {
        int freq[] = new int[1000000];
        int output[] = new int[n+1];
        for(int i=0; i<n; i++) {
            freq[arr[i]]++;
        }
        
        // it shows indices of value of arr at freq[i]
        for(int j=1; j<1000000; j++) {
            freq[j] = freq[j] + freq[j-1];
        }
        
        
        for(int i=n-1; i>=0; i--) {
            output[freq[arr[i]]-1] = arr[i];
            --freq[arr[i]];
        }
        
        
        for(int i=0; i<n; i++) {
            System.out.print(output[i]+ " ");
            
        }
    }
}

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
        
        bubbleSort(arr, n);
    }
    
    private static void bubbleSort(int arr[], int n) {
        int i, j;
        int temp;
        for(i=0; i<(n-1); i++) {
            // loop for all values of i
            for(j=0; j<(n-i-1); j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for(i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
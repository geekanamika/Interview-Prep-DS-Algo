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
        
        selectionSort(arr, n);
    }
    
    private static void selectionSort(int arr[], int n) {
        int i, j;
        int min, temp;
        for(i=0; i<(n-1); i++) {
            min = i;
            for (j=i+1; j<n; j++) {
                // find minimum
                if(arr[min] > arr[j] ) {
                    min = j;
                }
                
                // min contains the least value in i+1 to n-1
                // swap
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        
        for(i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
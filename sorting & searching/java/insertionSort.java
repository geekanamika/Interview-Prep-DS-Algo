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
        
        insertionSort(arr, n);
    }
    
    private static void insertionSort(int arr[], int n) {
        int i, j;
        int temp;
        for(i=1; i<n; i++) {
            temp = arr[i];
            j = i-1;
            while(j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        
        for(i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
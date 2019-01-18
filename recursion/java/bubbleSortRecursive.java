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
        
        bubbleRecursiveSort(arr, 0,n-1);
        
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void bubbleRecursiveSort(int arr[],int si, int li) {
        if (si==0 && li==0)
            return;
        if (si == li) {
            bubbleRecursiveSort(arr, 0, li-1);
            return;
        }
        if(arr[si] > arr[si+1] ) {
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
            //swap(arr[si], arr[si+1]);
        }
        bubbleRecursiveSort(arr, si+1, li);
    }
    
    
    
    
}

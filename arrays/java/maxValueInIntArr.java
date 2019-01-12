// find max val in array

import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		// print
// 		for(int i=0; i<n; i++) {
// 		    System.out.println(arr[i]);
// 		}

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
	}
}
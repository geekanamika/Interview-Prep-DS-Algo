/*
ALL INDICES PROBLEM
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. Print all the values in the returned array.


Input Format:
Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array

Constraints:
None

Output Format:
Display all the indices at which number M is found in a space separated manner

Sample Input:
5
3
2
1
2
3
2
Sample Output:
1 3
*/


import java.util.*;
public class Main {
    
    static int[] returnIndices(int arr[], int i, int m) {
        if(i == arr.length)
            return new int[0];
        
        int ret[] = returnIndices(arr, i+1, m);
        if(arr[i] == m) {
            int res[] = new int[ret.length + 1];
            res[0] = i;
            for(int j=0; j<ret.length; j++) {
                res[j+1] = ret[j];
            }
            return res;
        } else return ret;
        
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
		    arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int ret[] = returnIndices(arr, 0, m);
		for(int i=0; i<ret.length; i++) {
		    System.out.print(ret[i] + " ");
		}
    }
}
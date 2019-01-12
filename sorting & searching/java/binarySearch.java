// binary Search

/*
Who Will Win? Submissions: 8734   Accuracy: 26.54%   Difficulty: Basic   Marks: 1
        
Gautam and Subhash are two brothers. They are similar to each other in all respects except one. They have different ways of searching. When Gautam has to search for an item from a lot, he goes through all the items one by one and stops when he finds the item. However Subhash has an entirely different and interesting way of searching. However the search works only for items which are sorted. He goes to the middle of the lot, if he finds the desired item, he stops, if not, he checks whether the middle item is smaller or larger than the required item. If larger, he repeats the same process for the first half of the lot, otherwise second half. One day, the two brothers sit in a contest in which they have to find a name out of a sorted dictionary. Whoever finds out the name first will win the contest. The audience is very eager to know who will win and hence they want you to predict.

Input:

The first line of input takes the number of test cases, T.

The next T lines take the total number of names N, followed by M the position of the name to be searched, as well as the amount of time taken for each observation by Gautam G and Subhash S.

Output:

Print 1 in case Gautam will win, 2 in case Subhash will win, 0 in case of a draw in a separate line.

Constraints:

1<=T<=100

1<=N<=1000

1<=M<=N

1<=G<=100

1<=S<=100

Example:

Input:

3
10 8 10 25
10 8 10 30
10 8 10 12
Output:

2
2
2

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		short t, n, m, g, s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextShort();
		for(int i=0; i<t; i++) {
		    n = sc.nextShort();
		    m = sc.nextShort();
		    g = sc.nextShort();
		    s = sc.nextShort();
		    
		    int gau = m * g;
		    int sau = binarySearchCount(n, m, s);
		    if(sau < gau)
		        System.out.println(2);
		    else if (sau > gau )
		        System.out.println(1);
		    else 
		        System.out.println(0);
		}
	}
	
	private static int binarySearchCount(short n, short m, short s) {
	    int low = 1, high = n;
	    int mid;
	    int count =0;
	    while(low<=high) {
	        count++;
	        mid = (low+high)/2;
	        if(mid == m) {
	            return (s * count );
	        } else if (mid < m) {
	            low = mid + 1;
	        } else {
	            high = mid -1;
	        }
	    }
	    return -1;
	}

	// value compare and return index at which found else -1
	private static int binarySearch(int n, int arr[], int key) {
	    int low = 0, high = n-1;
	    int mid;
	  
	    while(low<=high) {
	        
	        mid = (low+high)/2;
	        if(arr[mid] == key) {
	            return mid;
	        } else if (arr[mid] < key) {
	            low = mid + 1;
	        } else {
	            high = mid -1;
	        }
	    }
	    return -1;
	}
}
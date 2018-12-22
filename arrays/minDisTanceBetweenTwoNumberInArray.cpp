/*
You are given an array A, of N elements. You need to find minimum distance between given two integers x and y.

Input Format:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. The first line of each test case contains an integer N denoting size array. Then in the next line are N space separated values of the array A. The last line of each test case contains two integers  x and y.

Output Format:
For each test case, print the required answer .

Your Task:
Your task is to complete the function minDist which returns  an integer denoting the minimum distance between two integers x and y in the array. If no such distance is possible then return -1.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= A, x, y <= 100

Example:
Input:
2
2
1 2
1 2
7
86 39 90 67 84 66 62 
42 12

Output:
1
-1

Explanation:
Testcase1: x=1 and y=2. minDistance between x and y is 1.
Testcase2: x=42 and y=12. We return -1 as the x and y don't exist in the array.
*/

// this solution is in O(n^2)
int minDist(int arr[], int n, int x, int y) {
     
    int min=INT_MAX, i, j;

    for(int i=0; i<n; i++) {
        for (int j=i+1; j<n; j++) {
            if((arr[i] == x && arr[j]==y) || (arr[j] == x && arr[i]==y)) {
                if(min>abs(j-i))
                    min = abs(j-i);
            }
        }
    }
    if(min==INT_MAX)
        return -1;
    else return min;        
}

// this solution is in O(n)
int minDist(int arr[], int n, int x, int y) {
     
    int min=INT_MAX, i, j, prev;
    for(i=0; i<n; i++) 
        if(arr[i] == x || arr[i]==y) {
            prev = i;
            break;
        }
            
            
    // check next occurence of x || y and ensure that at ith position, 
    // value is not same as prev'th position
    // also check it's min is less than existing min
    for(; i<n; i++) {
        if(arr[i]==x || arr[i]==y) {
            if(arr[i]!=arr[prev]) {
            if(min>abs(i-prev)) {
                min = abs(i-prev);
                prev= i;
           } 
        } else {
               prev=i;
            }
        }
    }
    if(min==INT_MAX)
        return -1;
    else return min;    
            
}
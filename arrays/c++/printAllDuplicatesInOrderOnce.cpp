/**
T(n) = O(n)
S(n) = constant

Find duplicates in an array Submissions: 12603   Accuracy: 16.01%   Difficulty: Easy   Marks: 2
            
Given an array A[], Your task is to complete the function printDuplicates which prints the duplicate elements of the given array. If no duplicate element is found  print -1.

Note: Auxiliary Space must be O(1) and Time complexity must be O(n).

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N which denotes number of elements of Array. Second line of each test case contains N space separated integers denoting elements of Array A[].

Output:
Print the duplicate elements from the array.The order of the output should be as the element found to be repeated.

Constraints:
1<=T<=100
1<=N<=50
0<=A[]<N

Example:
Input:
2
4
0 3 1 2
5
2 3 1 2 3 
Output:
-1
2 3 
*/

void printDuplicates(int arr[], int n)
{
   int i = 0;
   int temp;
   bool flag = false;

   for (i = 0; i < n; i++) {
       
       if (arr[arr[i] % n] >= n) {
          if(arr[arr[i] % n] < 2*n) {
              cout<<arr[i]%n<<" ";
              flag = true;
          }
       }
       arr[arr[i] % n] += n;
   }
   if(!flag)
        cout<<"-1";
}
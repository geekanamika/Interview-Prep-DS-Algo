
/**
Sorted subsequence of size 3
        
Given an array A of N integers, Your task is to complete the function find3Numbers which finds any 3 elements in it such that A[i] < A[j] < A[k] and i < j < k. You need to return them as a vector, if no such element is present then return the empty vector of size 0.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. The first line of each test case contains an integer N denoting the size of the array A in the next line are N space separated values of the array A.

Output:
For each test case in a new line output will be 1 if the sub-sequence returned by the function is present in array A else 0.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= A[ ] <= 106

Example:
Input:
2
5
1 2 1 1 3
3
1 1 3
Output:
1
0
*/
vector<int> find3Numbers(vector<int> arr, int N)
{
   vector<int> res(3,32000);
   int i;
   for(i=0; i<N; i++) {
       if(arr[i]<=res[0]) {
           res[0] = arr[i];
       } else if (arr[i]<=res[1]) {
           res[1] = arr[i];
       } else 
            break;
   }
   if(i == N) {
       return res;
   }
   
   // optimize smallest variable
   for(int j=0; j<=i; j++) {
       if(arr[j]<res[1]) {
           res[0] = arr[j];
           break;
       }
   }
   res[2] = arr[i];
   //cout<<res[0]<<" "<<res[1]<<" "<<res[2]<<endl;
   return res;
   
}

/**
  After this function check if res[0]<res[1] && res[1]<res[2]
  Also, if res is a subsequence of given array
*/

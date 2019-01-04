/**

Max sum path in two arrays
        
Given two sorted arrays A and B. The task is to complete the function max_path_sum that takes 4 argument, the first two arguments represent the 2 arrays A[] and B[] and the last two arguments l1, l2 denote the size of array A and B respectively. The function returns the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays .

Note: You can switch from one array to another array only at common elements.

Input:
The first line of input contains an integer T denoting the no of test cases . Then T cases follow.
Each test case contains 3 lines. The first line contains two space separated integers l1 and l2 denoting the length of the two sorted array A and B. In the second line is the space separated values of array A and in the third line are space separated values of array B.

Output:
For each test case the output is the max sum obtained in such fashion .

Constraints:
1 <= T <= 100
1 <= N, M <= 103
1 <= A[], B[] <= 104

Example:
2
5 4
2 3 7 10 12
1 5 7 8 
3 3
1 2 4
1 2 7

Output
35 
10

Explanation:
Testcase 1: For first test case the path will be 1+5+7+10+12 = 35.
Testcase 2: For second test case the path will be 1+2 +7=10.

*/


/*You are required to complete this method*/
 int max_path_sum(int a[], int b[], int m, int n)
{
    vector<int> common;
    int i=0, j=0;
    
    // print till both have common length available
    while(i<m && j<n) {
        if(a[i]<b[j]) {
            i++;
        } else if (a[i]>b[j]) {
            j++;
        } else {
            common.push_back(i);
            common.push_back(j);
            i++;
            j++;
        }
    }
    
    // for(j=1; j<common.size(); j+=2) {
    //     cout<<common[j-1]<<" "<<common[j]<<endl;
    // }
    int s1 = 0, s2 =0, sum=0;
    int i1 =0, i2 =0;
    // now, common contains intersection indexes-
    // even for arr1 & odd for arr2
    for(j=1; j<common.size(); j+=2) {
        // calculate sum1
        s1 =0;
        s2 =0;
        while(i1 <= common[j-1]) {
            s1 += a[i1];
            i1++;
        }
        // calculate sum2
        while(i2 <= common[j]) {
            s2 += b[i2];
            i2++;
        }
        // select sum
        if(s1>s2)
            sum += s1;
        else sum += s2;
    }
    
    // add rest of the array after common point 
    s1 =0;
    s2 =0;
    while(i1 < m) {
        s1 += a[i1];
        i1++;
    }
    // calculate sum2
    while(i2 < n) {
        s2 += b[i2];
        i2++;
    }
    // select sum
    if(s1>s2)
        sum += s1;
    else sum += s2;
    //cout<<sum<<endl;
    return sum;
}
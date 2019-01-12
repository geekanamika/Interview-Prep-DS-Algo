/*
First Missing Integer
Asked in:  
Model N
InMobi
Amazon
Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.


*/

int firstMissingPositive(vector<int> &arr) {
    // find min & max
    int min = arr[0], max = arr[0];
    sort(arr.begin(), arr.end());
    min = arr[0];
    max = arr[arr.size()-1];
    if (max <= 0)
        return 1;
    int i=0;    
    if (min<=0) {
        // loop till first first positive index of arr
        while(arr[i]<=0) {
            i++;
            //cout<<i<<" ";
        }
    } 
    //cout<<"arr [min]"<<" is "<<min<<endl;
    for(int j=1; i<=max; i++,j++) {
        //cout<<"arr ["<<i<<"] is "<<arr[i]<<endl;
        if(arr[i]!=j) {
            return j;
        }
        
    }    
    return max+1;
    
}

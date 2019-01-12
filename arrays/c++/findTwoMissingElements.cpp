#include <iostream>
#include<vector>
using namespace std;

// Time: O(n) & Space: O(n)
void printRepeatingElementsUsingCount(vector<int> arr, int n) {
    int i;
    int a = 0, b = 0;
    // create an array count of size n+1
    vector<int> count(n-1, 0);
    // count occurence of all elements
    
    for(i=0; i<n; i++) {
        if(count[arr[i]] == 0)
            count[arr[i]]++;
        else if (count[arr[i]] == 1)    
            cout<<arr[i]<<" ";
    }    
    cout<<endl;
}

int main() {
	int t, temp;
    int n;
    cin>>t;
    while(t--) {
        cin>>n;
        vector<int> arr;
        for(int i=0; i<n+2; i++) {
            cin>>temp;
            arr.push_back(temp);
        }
        printRepeatingElementsUsingCount(arr, n+2);
    }
    return 0;
}
#include <iostream>
#include<cstring>
using namespace std;

void rotate(char *arr, int k) {
    int len = strlen(arr);
    
    // shift full array by k elements 
    // for ex: anamika\0 will be ananamika\0
    for(int i=len; i>=0; i--){
        arr[i+k] = arr[i];
    }
    
    // take length, j is the index of char from which we need to shift from 
    // s is the begining index
    len = strlen(arr);
    int j = len-k;
    int s=0;
    
    while(s<k) {
        arr[s] = arr[j];
        s++;
        j++;
    }
    arr[len-k] = '\0';
    
    cout<<arr;
    
    
}

int main() {
    
    char str[100];
    cin.getline(str, 99);
    int k=2;
    rotate(str, k);
    
    return 0;
}



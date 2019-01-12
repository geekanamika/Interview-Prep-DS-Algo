#include <stdio.h>
#include<iostream>
#include<cstring>

using namespace std;
// print all substrings of a string
void stairCaseSearch(int arr[][4], int row, int col, int key) {
   int i=0,j=col-1;
   while(i<row && j>=0) {
       if(arr[i][j]==key){
           cout<<"found at "<< (i+1)<<"th row & "<< (j+1) <<"th column";
           return;
       }
       else if (arr[i][j]<key)
        i++;
        else j--;
   }
   cout<<"not found";
}
int main() {
	int arr[][4] = {{1,4,7,10},{2,5,8,11},{3,6,9,12}};
	stairCaseSearch(arr, 3, 4,1);
	return 0;
}
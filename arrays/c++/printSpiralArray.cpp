#include <stdio.h>
#include<iostream>
#include<cstring>

using namespace std;
void printArray(int arr[][4], int row, int col) {
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++)
            cout<<arr[i][j]<<" ";
        cout<<endl;    
    }
}
void spiralPrintMatrix(int arr[][4], int row, int col) {
    int startRow = 0, endRow = row-1, startCol = 0, endCol = col-1;
    int i,j;
    while(startRow<=endRow && startCol<=endCol) {
        // print startRow 
        for(i=startCol; i<=endCol; i++) {
            cout<<arr[startRow][i]<<" ";
        }
        startRow++;
        // print end column
        for(i=startRow; i<=endRow; i++) {
            cout<<arr[i][endCol]<<" ";
        }
        endCol--;
        // print end row
        if(startRow<endRow){
            for(i=endCol; i>=startCol; i--) {
                cout<<arr[endRow][i]<<" ";
            }
            endRow--;
        }
        
        // print start column
        if(startCol<endCol) {
            for(i=endRow; i>=startRow; i--) {
                cout<<arr[i][startCol]<<" ";
            }
            startCol++;
        }
        
    }
}

int main() {
	int arr[][4] = {{1,4,7,10},{2,5,8,11},{3,6,9,12}, {4,8,7,9}};
	
	printArray(arr, 4, 4);
	cout<<endl;
	spiralPrintMatrix(arr, 4, 4);
	return 0;
}
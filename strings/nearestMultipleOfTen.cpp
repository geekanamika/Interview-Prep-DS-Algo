/**
Nearest multiple of 10
          
Given a positive number N. The task is to round N to nearest multiple of 10. Number can be so big and can contains 1000 of digits.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a positive number N.

Output:
For each test case, print the nearest multiple of 10 in new line.

Constraints:
1 <= T <= 100
1 <= |Number length| <= 1000

Example:
Input:
2
15
29

Output:
10
30
*/

#include <iostream>
using namespace std;

void checkNearestMultiple(string str) {
    int len = str.length()-1;
    int a = str[len] - '0';
    if (len==0) {
        if (a>=0 && a<=5)
            str = "0";
        else 
            str = "10";
    } 
    else {
        int b = str[len-1] - '0';
       if (a>=0 && a<=5)
       {
            str[len] = (char) (0+'0');
        } 
        else if(a>=6 && a<=8 && b>=0 && b<=8)
        {
            str[len] = (char) (0+'0');
            int temp = str[len-1] - '0';
            ++temp;
            str[len-1] =(char) (temp + '0');
            
        }  
        else if (a==9 || b==9) {
            
            str[len] = (char) (0+'0');
            len--;
            b = str[len]-'0';
            while(len>=0 && b==9) {
                str[len] = (char) (0+'0');
                len--;
                b = str[len]-'0';
            }
            if(len>=0) {
                int temp = str[len] - '0';
                ++temp;
                str[len] =(char) (temp + '0');
            } else {
                cout<<"1";
            }
        }
    } 
    cout<<str<<endl;
}

int main() {
	int t;
	cin>>t;
	string str;
	while(t--) {
	    cin>>str;
	    checkNearestMultiple(str);    
	}
	return 0;
}
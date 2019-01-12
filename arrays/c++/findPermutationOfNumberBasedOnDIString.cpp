/*
Given a positive integer n and a string s consisting only of letters D or I, you have to find any permutation of first n positive integer that satisfy the given input string.

D means the next number is smaller, while I means the next number is greater.

Notes

Length of given string s will always equal to n - 1
Your solution should run in linear time and space.
Example :

Input 1:

n = 3

s = ID

Return: [1, 3, 2]

*/

vector<int> findPerm(const string str, int n) {
    int min = 1;
    int max = n;
    vector<int> res;
    int len = str.length();
    
    for(int i=0; i<len; i++) {
        if(str[i] == 'D') {
            res.push_back(max);
            max--;
        } else {
            res.push_back(min);
            min++;
        }
    }
    res.push_back(min);
    return res;
}

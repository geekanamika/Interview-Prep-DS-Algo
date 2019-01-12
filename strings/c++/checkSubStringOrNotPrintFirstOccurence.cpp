/**
Implement strstr
              
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s.

Input Format:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of each test case contains two strings s and x.

Output Format:
For each test case, in a new line, output will be an integer denoting the first occurrence of the x in the string s. Return -1 if no match found.

Your Task:
Since this is a function problem, you don't have to take any input. Just complete the strstr function.

Constraints:
1 <= T <= 100
1<= |s|,|x| <= 1000

Example:
Input
2
GeeksForGeeks Fr
GeeksForGeeks For
Output
-1
5
*/

int strstr(string s, string x)
{
     int i=0, j=0, ben;
     bool flag = false;
     int n = s.length(), m = x.length();
     for(i=0; i<n && j<m; i++) {
         
         if(s[i]==x[j] && !flag) {
             j++;
             ben = i;
             flag = true;
         } else if(s[i]==x[j] && flag) {
             j++;
         } else {
             j=0;
             flag = false;
         }
     }
     
     if(j==m) {
         return ben;
     } else {
         return -1;
     }
}
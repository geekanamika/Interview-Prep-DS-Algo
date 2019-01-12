/*
Add two fractions
You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx).

Input Format:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .

Output Format:
For each test case, in a new line,  output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.

Your Task:
Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function addFraction  which adds the two fractions and prints the resulting fraction. The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.

Constraints:
1 <= T <= 100
1 <= den1,den2,num1,num2 <= 1000

Example:
Input
1
1 500 2 500
Output
3/500

Explanation:
In above test case 1/500+2/500=3/500
*/


void addFraction(int num1, int den1, int num2,int den2)
{
    long lcm;
    int b = den2;
    int a = den1;
    // find gcd 
    int flag;
    while(a%b!=0) {
        flag = a;
        a = b;
        b = flag%b;
    }
    // now b is gcd, find lcm also final den
    lcm = (den1*den2)/b;
    
    num1 = (lcm/den1)*num1;
    num2 = (lcm/den2)*num2;
    // final num
    num1 = num1+num2;
    a = num1;
    b = lcm;
    // find gcd 
    while(a%b!=0) {
        flag = a;
        a = b;
        b = flag%b;
    }
    
    cout<<num1/b<<"/"<<lcm/b<<endl;
}
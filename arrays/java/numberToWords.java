/*
Number to words Submissions: 8718   Accuracy: 19.65%   Difficulty: Medium   Marks: 4
            
Given number into words. For example, if “1234” is given as input, output should be “one thousand two hundred and thirty four”

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N.

Output:

Print the number into words (in small letter).

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 9999

Example:

Input:
2
2
142

Output:
two
one hundred and forty two
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void printUnitDigit(int n) {
        String[] units = new String[] {"zero", "one", "two",
            "three", "four", "five", "six", "seven", "eight", "nine"
        };
        System.out.print(units[n]+ " ");
    }
    
    static void printTenDigit(int n) {
        if (n >= 10 && n<= 19) {
            String[] tens = new String[] {"ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"
            };  
            System.out.print(tens[n%10]+ " ");
            
         }
        else {
            String[] tens = new String[] {"ten", "twenty", "thirty",
                "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety"
            };  
            if(n%10 == 0) {
                System.out.print(tens[(n/10)-1]+ " ");
            } else {
                System.out.print(tens[(n/10)-1]+ " ");
                printUnitDigit(n%10);
            }
            
        }
    }
    
    static void printThreeDigit(int n) {
        int temp = n;
        String[] thirds = new String[] {"zero", "one", "two",
            "three", "four", "five", "six", "seven", "eight", "nine"
            };  
            System.out.print(thirds[n/100]+ " ");
            System.out.print("hundred "); 
        int rem = n%100;
        if (rem !=0) {
            System.out.print("and "); 
            if (rem >=1 && rem <=9)
                printUnitDigit(rem);
            else if (rem>=11 && rem<=99)
                printTenDigit(rem);
         }    
    }
    
    static void printFourDigit(int n) {
        int temp = n;
        String[] fourths = new String[] {"zero", "one", "two",
            "three", "four", "five", "six", "seven", "eight", "nine"
            };  
            System.out.print(fourths[n/1000]+ " ");
            System.out.print("thousand "); 
            int rem = n%1000;
        if (rem !=0) {
            if (rem >=1 && rem <=9) {
                System.out.print("and "); 
                printUnitDigit(rem);
            }
            else if (rem>=10 && rem<=99) {
                System.out.print("and "); 
                printTenDigit(rem);
            }
            else printThreeDigit(rem);
         }
    }
    
    public static void main (String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            n = sc.nextInt();
            if(n/10 == 0) {
                // only possible for one digit
                printUnitDigit(n);
            } else if (n/100 == 0) {
                printTenDigit(n);
            } else if (n/1000 == 0) {
                printThreeDigit(n);
            } else {
                printFourDigit(n);
            }
            System.out.println();
        }
    }
}
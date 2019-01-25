/* package codechef; // don't place package name! */

/*
ATM Problem Code: HS08TEST Solved Submit

  
All submissions for this problem are available.
Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.

Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.

Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.

Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.

Example - Successful Transaction
Input:
30 120.00

Output:
89.50
Example - Incorrect Withdrawal Amount (not multiple of 5)
Input:
42 120.00

Output:
120.00
Example - Insufficient Funds
Input:
300 120.00

Output:
120.00
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		int x;
		double tr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String s[] = str.trim().split("\\s+");
		
		x = Integer.parseInt(s[0]);
		tr = Double.parseDouble(s[1]);
		
		if (tr <  x ) {
			System.out.printf("%.2f", tr);
		} else if (x%5 ==0 && tr > (x+0.5)) {
			tr -= x;
			tr -= 0.5;
			System.out.printf("%.2f", tr);
		} else {
			System.out.printf("%.2f", tr);	
		}
	}
}
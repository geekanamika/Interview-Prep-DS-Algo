/*
Prime Sum
Asked in:  
Epic systems
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
*/

public class Solution {
    public ArrayList<Integer> primesum(int num) {
        if (num <=2) {
            return new ArrayList<Integer>();
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        // find prime number using SOE till n/2;
        int sq = 4;
        int p = 2;
        int n = num/2;
        boolean soe[] = new boolean[num+1];
        while (sq <= num) {
            while (sq <= num) {
                soe[sq] = true;
                sq += p;
            }
            
            // find next unmarked yet
            p++;
            while(true) {
                if (soe[p] == false)
                    break;
                else
                    p++;
            }
            sq = p*p;
        }
        
        // now traverse through 3 to num in soe & find pair
        for (int i=2; i<=n; i++) {
            if (soe[i] == false && soe[num-i] == false){
                res.add(i);
                res.add(num-i);
                return res;
            }
        }
        return res;
    }
}

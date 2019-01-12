/*

Reverse integer
Asked in:  
HCL
Bloomberg
Reverse digits of an integer.

Example1:

x = 123,

return 321
Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer



*/

public class Solution {
    public int reverse(int A) {
        long res = 0, count = 0;
        while(A!=0) {
            res = (res*10)+(A%10);
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)
                return 0;
            A /= 10;
        }
        return (int)res;
    }
}

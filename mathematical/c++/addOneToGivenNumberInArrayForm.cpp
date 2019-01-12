
/**

Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

*/

int n = val.size()-1;
    vector<int> res;
    if(val[0] == 0 && n>0) {
        // count initial zeros
        int count=1;
        for(int i=1; i<n; i++) {
            if(val[i] == 0) {
                count++;
            } else {
                break;
            }
        }
        // count time towards left
        for(int i=count; i<=n; i++) {
            res.push_back(val[i]);
        }
        n-=count;
        //n++;
    } else {
        res = val;
    }
    // in range so, just add 1 to last digit
    if(0<=res[n] && res[n]<=8) {
        res[n] = res[n] + 1;
    } else if (res[n] == 9) {
        int c=0, flag;
        res[n] = 0;
        n--;
        c = 1;
        while(c && (n>=0)) {
            
            flag = res[n] + c;
            if(flag<10) {
                res[n] = flag;
                c = 0;
            } else if (flag == 10 ) {
                res[n] = 0;
                c = 1;
                n--;
            }
        }
        if(c) {
            // shift towards  right & put 1 at 0th position
            n = res.size();
            res.resize(n+1);
            //cout<<n<<" ";
            res[0] = c;
            for(int i=0; i<n; i++) {
               // cout<<i<<" ";
                res[i+1] = 0;
            }
            //cout<<res.size();
            
        }
        
    }
    return res;
    
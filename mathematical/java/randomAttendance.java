public class Solution {
    public ArrayList<Integer> solve(int n, ArrayList<Integer> B) {
       ArrayList<Integer> arrli = new ArrayList<Integer>(n);
       ArrayList<Integer> res = new ArrayList<Integer>(B.size());
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
       Collections.sort(arrli, new SortByFirstDigit());
       
       for (Integer i: B) {
           res.add(arrli.get(i-1));
       }
       
       return res;    
    }
    
    class SortByFirstDigit implements Comparator<Integer> 
    { 
        public int compare(Integer a, Integer b) 
        { 
            
            // Find total number of digits - 1 
            int digits = (int)(Math.log10(a)); 
          
            // Find first digit 
            int a1 = (int)(a / (int)(Math.pow(10, digits))); 
            
            // Find total number of digits - 1 
            digits = (int)(Math.log10(b)); 
          
            // Find first digit 
            int b1 = (int)(b / (int)(Math.pow(10, digits))); 
            if(a1 == b1)
                return 0;
            else if (a1>b1) 
                return 1;
            else 
                return -1;
        } 
    }
    
    
}


///////////////////////////////////////////////////


public class Solution {
    
    private long poz(int n) {
        long res = n;
        long k = 1;
        n /= 10;
        while (n > 0) {
            res += (n % 10) * k + 1;
            n /= 10;
            k = k * 10 + 1;
        }
        return res;
    }
    
    private long max(int n) {
        long res = 0;
        while (n > 0) {
            res = res * 10 + 9;
            n /= 10;
        }
        return res;
    }
    
    private String find(long p, long max) {
        // System.out.println("-> " + p + " " + max);
        if (max < 10)
            return "" + p;
        
        long groupSize = max / 9;
        long group = p / groupSize;
        long offset = p % groupSize;
        if (offset == 0)
            return "" + group;
        else
            return "" + group + find(offset - 1, max / 10);
    }
    
    public ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        long pozA = poz(A);
        long max = max(A);
        for (int b : B) {
            long p = b - 1 + max / 9;
            if (p <= pozA) {
                res.add(Integer.parseInt(find(p, max)));
            } else {
                res.add(Integer.parseInt(find(p - A - 1, max / 10)));
                // System.out.println(A+" "+b+" "+p+" "+max+" "+pozA);
            }
        }
        return res;
    }
}


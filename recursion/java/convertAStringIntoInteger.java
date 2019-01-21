import java.util.*;
public class Main {
    
    static int getNumFromString(String str) {
        // base case 
        if(str.length() == 0)
            return 0;
        char ch = str.charAt(0);
        int num = ch - '0';
        int p = 1;
        for(int i=1; i<str.length(); i++ ) {
            p *= 10;
        }
        
        int res = getNumFromString(str.substring(1) );
        p = (num*p) + res;
        //System.out.println(p);
        return p; 
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(getNumFromString(str) );
    }
}
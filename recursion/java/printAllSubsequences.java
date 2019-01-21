import java.util.*;
public class Main {
    
    static ArrayList<String> getSubSequences(String str) {
        // base case
        if(str.length() == 0 ) {
            ArrayList<String> res = new ArrayList<String>();
            res.add("");
            return res;
        }
        // get current char
        char ch = str.charAt(0);
        // sending substring from 1 to n of str recursively
        ArrayList<String> recRes = getSubSequences(str.substring(1) );
        ArrayList<String> res = new ArrayList<>();
        //res = recRes;
        for(int i=0; i<recRes.size(); i++) {
            res.add(recRes.get(i) );
        }
        for(int i=0; i<recRes.size(); i++) {
            res.add(ch + recRes.get(i) );
        }
        
        return res;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		ArrayList<String> res = getSubSequences(str);
		System.out.println(res.size() );
		for(int i=0; i<res.size(); i++) {
            System.out.print(res.get(i)+ " ");
        }
		
    }
}
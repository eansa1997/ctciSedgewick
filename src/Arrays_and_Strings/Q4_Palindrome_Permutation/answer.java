package Arrays_and_Strings.Q4_Palindrome_Permutation;

import java.util.HashMap;

import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String test1 = "Tact Coa";
        StdOut.println(test1);
        test1.toLowerCase();
        StdOut.println("Palindrome Permutation? : "+ isPalindromePermutation(test1));
    }

     
    public static boolean isPalindromePermutation(String src){
        HashMap<Character, Boolean> chOccur = new HashMap<Character, Boolean>();
        for(char c: src.toCharArray()){
            if(Character.isAlphabetic(c)){
                if( chOccur.containsKey(c)){
                    boolean newState = !chOccur.get(c);
                    chOccur.put(c, newState);
                }else{
                    chOccur.put(c, false);
                }
            }
        }
        int oddCount = 0;
        for(boolean b : chOccur.values()){
            if(b)
                oddCount++;
        }
        return oddCount <= 1;
    }

}
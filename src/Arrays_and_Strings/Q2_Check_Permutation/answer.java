package Arrays_and_Strings.Q2_Check_Permutation;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String test1 = "hello";
        String test2 = "oellh";
        StdOut.println(test1+", "+test2+" | "+ isPermutation1(test1, test2));
    }

    // This method has O(logN ) time due to sorting. 
    public static boolean isPermutation1(String a, String b){
        if(a.length() != b.length())
            return false;
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1, b1))
            return true;

        return false;
    }

}
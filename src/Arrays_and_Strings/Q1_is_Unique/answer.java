package Arrays_and_Strings.Q1_is_Unique;
import java.util.HashSet;
import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String test1 = "hello";
        String test2 = "helLo";
        
        StdOut.println(test1+" "+ isUnique(test1));
        StdOut.println(test2+" "+ isUnique(test2));
    }

    public static boolean isUnique(String s){
        HashSet<Character> charSet = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            if(charSet.contains(s.charAt(i)))
                return false;
            charSet.add(s.charAt(i));
        }
        return true;
    }
}
package Arrays_and_Strings.Q5_One_Away;
import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String one = "pale";
        String two = "ple";
        StdOut.println(one);
        StdOut.println(two);
        StdOut.println("One away?: "+ isOneAway(one, two));
    }

    public static boolean isOneAway(String one, String two){
        if(Math.abs( one.length() - two.length() ) > 1)
            return false;
            boolean diff = false;
        for(int i = 0, j = 0; i < one.length() && j < two.length(); i++, j++ ){
            if(one.charAt(i) != two.charAt(j)){
                // more than one edit return false
                if(diff)
                    return false;
                else{
                    // one insert or delete is the same, and it can only happen when length difference is at most 1
                    if( Math.abs( one.length() - two.length() ) == 1){
                        // backtracks one on the shorter string, since both cases can be handled by 'deleting' one char from bigger string
                        if(one.length() > two.length()){
                            j--;
                            diff = true;
                        }else{
                            i--;
                            diff = true;
                        }
                    }else if(one.length() == two.length()){
                        // this string is one edit away so it must have same length and set the flag
                        diff = true;

                    }
                }
            }
        }
        return true;
    }
}
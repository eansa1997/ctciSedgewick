package Arrays_and_Strings.Q6_String_Compression;

import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String test1 = "aaaaabccccaaa";
        String test2 = "aaaaabbbbggggdd";
        StdOut.println(test1+" : "+ StringCompression(test1));
        StdOut.println(test2+" : "+ StringCompression(test2));
    }

    public static String StringCompression(String s){
        StringBuilder ans = new StringBuilder();
        int count;
        for(int i = 0; i < s.length();i++){
            count = 0;
            count++;
            while(i+1 < s.length() && s.charAt(i +1) == s.charAt(i)){
                count++;
                i++;
            }
            ans.append(s.charAt(i) +""+ count);
        }
        if(s.length() <= ans.length())
            return s;
        return ans.toString();
    }
}
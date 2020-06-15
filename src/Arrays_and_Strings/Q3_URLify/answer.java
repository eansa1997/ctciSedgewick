package Arrays_and_Strings.Q3_URLify;

import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        String test1 = "Mr   John     Smith   ";
        StdOut.println(test1);
        StdOut.println("URLify: "+ urlify(test1));
    }


    public static String urlify(String src){
        StringBuilder ans = new StringBuilder();
        char[] ch = src.toCharArray();
        for(int i =0; i < ch.length; i++){
            if(ch[i] == ' '){
                int j = i;
                while(j < ch.length && ch[j] == ' '){
                    j++;
                }
                i = j-1;
                if(i != ch.length-1)
                    ans.append("%20");
            }else{
                ans.append(ch[i]);
            }
        }

        return ans.toString();
    }

}
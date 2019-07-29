package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class GWordCapitalization {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

            String line = in.nextLine();
            char a [] = line.toCharArray();
            to_capitalization_first_letter(a);
        String ans ="";
            for(char c : a)ans+=c;

            out.println(ans);
        }


    static  void  to_capitalization_first_letter(char a[]){
        char c = a[0];
        if(c>=97 && c<=122) c= (char) (c-32);
        a[0]=c;

    }

}

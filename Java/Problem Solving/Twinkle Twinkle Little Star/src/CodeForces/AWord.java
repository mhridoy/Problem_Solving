package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class AWord {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int uc = uppercaseCount(s);
        int lc = lowercaseCount(s);
        if(uc>=lc)out.println(s.toUpperCase());
        else out.println(s.toLowerCase());


    }
    int uppercaseCount(String s){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)>=65 && s.charAt(i)<=90 )count++;
        }
        return count;
    }
    int lowercaseCount(String s){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)>97 && s.charAt(i)<=122)count++;
        }
        return count;
    }
}

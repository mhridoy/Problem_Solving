package CodeForces;

import Fast_IO.InputReader;

import java.io.IOException;
import java.io.PrintWriter;

public class LWord {
    public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {

        String word = in.nextLine();
        char a [] = word.toCharArray();
        int upper_case_letter = upper_case(a);
        int lower_case_letter = lower_case(a);
        if(upper_case_letter==lower_case_letter)
        {
            out.println(word.toLowerCase());
        }
        else if( upper_case_letter>lower_case_letter)
            out.println(word.toUpperCase());
        else
            out.println(word.toLowerCase());
    }

    private int lower_case(char[] a) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=97 && a[i]<=122)
                count++;
        }
        return count;
    }

    private int upper_case(char[] a) {
        int count=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>=65 && a[i]<=90)count++;
        }
        return count;
    }

}

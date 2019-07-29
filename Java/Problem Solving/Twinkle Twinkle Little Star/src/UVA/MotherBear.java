package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class MotherBear {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String line = null;
        while (in.hasNext()) {
           line= in.nextLine().toLowerCase();
               // out.println(line);
                String temp[] = line.split(" ");
                String temporary = "";
                for (int i = 0; i < temp.length; i++) {
                    temporary += temp[i];
                }
                out.println(temporary);
                if (palindrome(temporary))
                    out.println("You won’t be eaten!");
                else
                    out.println("Uh oh..");
            }
        }

    private boolean palindrome(String text) {
        String temp ="";
        for (int i = text.length()-1; i >=0 ; i--) {

            temp+=text.charAt(i);
        }
        if(temp.equals(text))
            return true;
        else
            return false;
    }
}

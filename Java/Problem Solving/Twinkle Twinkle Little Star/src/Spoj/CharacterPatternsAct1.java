package Spoj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CharacterPatternsAct1 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            for (int i = 1; i <=a ; i++) {
                for (int j = 1; j <=b ; j++) {
                    if(i%2!=0 && j%2!=0)
                        out.print("*");
                    else if(i%2==0 && j%2!=0)
                        out.print(".");
                    else if(i%2!=0 && j%2==0)
                        out.print(".");
                    else out.print("*");
                }
                out.println();

            }
            out.println();
        }
    }
}

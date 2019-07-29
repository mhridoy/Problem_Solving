package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class OCheckCode {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        String c = in.nextLine();
        if (1 <= a && a <= 10 && 1 <= b && b <= 10) {
            // String temp[] = c.split("-");
        /*if(temp[0].length()==a && temp[1].length()==b)
            out.println("Yes");
        else
            out.println("No");*/
            int crray[] = new int[a * 100];
            int drray[] = new int[b * 100];
            int index = 0, mindex = 0;
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) == '-') {
                    index = cleanthetank(crray, i - 1, c);
                    mindex = fullthetank(drray, i + 1, c);
                    break;
                }
            }
            if (index == a && mindex == b)
                out.println("Yes");
            else
                out.println("No");
        }
        else
            out.println("No");
    }

        private int cleanthetank ( int[] crray, int i, String c){
            int index = 0;
            for (int j = 0; j <= i; j++) {
                crray[index++] = c.charAt(j);
            }
            return index;
        }

        private int fullthetank ( int[] drray, int i, String c){
            int mindex = 0;
            for (int j = i; j < c.length(); j++) {
                // System.out.println(mindex);
                drray[mindex++] = c.charAt(j);
            }
            return mindex;
        }

}

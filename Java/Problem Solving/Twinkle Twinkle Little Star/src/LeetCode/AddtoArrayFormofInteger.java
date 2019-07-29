package LeetCode;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AddtoArrayFormofInteger {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
       int array [] = {1,2,0,0};
       int k =34;
       String s="";
        for (int i = 0; i <4 ; i++) {
            s+=String.valueOf(array[i]);
        }
        int ans = Integer.parseInt(s)+k;
        String a = String.valueOf(ans);
        char dd [] = a.toCharArray();
        int temp [] = new int[dd.length];
        int index=0;
        for(int i=0; i< array.length;i++) {
            temp[index++] = dd[i]-'0';
            //System.out.println(temp[index]);
        }

    }
}

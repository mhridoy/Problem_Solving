package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class DLowestNumber {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int low = Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i <n ; i++) {
            int x = in.nextInt();
            if(x<low){
                low= x;
                index=i;
            }
        }
        out.println(low +" "+(index+1));
    }
}

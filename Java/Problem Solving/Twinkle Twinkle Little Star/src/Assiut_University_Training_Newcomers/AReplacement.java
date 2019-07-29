package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AReplacement {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int array[] = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]=in.nextInt();
            if(array[i]<0)array[i]=2;
            else if(array[i]>0)array[i]=1;
        }
        for (int i = 0; i <n ; i++) {
            out.print(array[i]+" ");
        }
    }
}

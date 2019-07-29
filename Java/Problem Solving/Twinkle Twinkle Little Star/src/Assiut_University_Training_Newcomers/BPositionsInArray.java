package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BPositionsInArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int array [] = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(array[i]<=10)
                out.println(String.format("A[%d] = %d",i,array[i]));
        }
    }
}

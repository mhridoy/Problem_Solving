package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TSortNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int array [] = new int[3];
        for (int i = 0; i <3 ; i++) {
            array[i]=in.nextInt();
        }
        int crray[] = new int[3];
        System.arraycopy(array,0,crray,0,3);
        Arrays.sort(crray);
        for (int x : crray) {
            out.println(x);
        }
        out.println();
        for(int x : array)
            out.println(x);
    }
}

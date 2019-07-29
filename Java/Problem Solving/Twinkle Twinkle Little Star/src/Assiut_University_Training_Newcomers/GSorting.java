package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class GSorting {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int array [] = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;

                }
            }
        }
        for (int i = 0; i <n ; i++) {
            out.print(array[i]+" ");
        }

    }
}

package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class NBeautifulArrays {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- != 0) {
            int n = in.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

            int crray[] = new int[n * n];
            Arrays.fill(crray,-100001);
            int index = 0;
            boolean fata = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        crray[index++] = array[i] * array[j];
                        if (i == crray[index] || j==crray[index]) {
                            fata = true;
                            //break;
                        }
                    }
                }
            }
            boolean tata = false;

            for (int i = 0; i < index; i++) {
                if(crray[i]!=-100001)
                if (rara(crray[i], array)|| fata==true) {
                    {
                        out.println("yes");
                        tata = true;
                        break;
                    }
                    //return;
                }
            }
            if (!tata)
                out.println("no");
        }


    }

    private boolean rara(int i, int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (i == array[j]) return true;

        }
        return false;
    }
}



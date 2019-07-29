package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class LReplaceMinMax {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int min = 0,max=0;
        int array [] = new int[test];
        for (int i = 0; i <test ; i++) {
            array[i]= in.nextInt();
            if(low>array[i]) {
                low=array[i];
                min=i;
            }
            if(high<array[i]){
                high=array[i];
                max=i;
            }

        }
        array[min]=high;
        array[max]=low;
        for (int i = 0; i <test ; i++) {
            out.print(array[i]+" ");
        }
    }

}

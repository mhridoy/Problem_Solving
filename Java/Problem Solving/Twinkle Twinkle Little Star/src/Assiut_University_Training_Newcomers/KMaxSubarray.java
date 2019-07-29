package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class KMaxSubarray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int n = in.nextInt();
            int array [] = new int[n];
            int save[] = new int[(int)Math.pow(2,n)];
            for (int i = 0; i <n ; i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array);
            int index=0;
            for (int i = 0; i <n ; i++) {
                save[index++]=array[i];
                for (int j = i+1; j <n ; j++) {
                    save[index++]=array[j];
                }
            }
            Arrays.sort(save);
            for (int i = 0; i <save.length ; i++) {
                if(save[i]!=0)
                out.print(save[i]+" ");
            }
            out.println();
        }
    }
}

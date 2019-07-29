package UVA;

import Fast_IO.InputReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class PermutationArrays {
    public void solve(int testNumber, InputReader in, PrintWriter out){
        int test = in.nextInt();

        for (int i = 0; i <test ; i++) {
            in.nextLine();
            String first_line = in.nextLine();
            String second_line = in.nextLine();
            String temp1= first_line;
            String temp2 = second_line;
           String a[] = temp1.split(" ");
           String b[] = temp2.split(" ");
           int array [] = new int[a.length];
            for (int j = 0; j <array.length ; j++) {
                array[j]= Integer.parseInt(a[j]);
            }
            //Arrays.sort(array);
            String crray [] = new String[b.length];
            for (int j = 0; j <b.length ; j++) {
                crray[array[j]-1]=b[j];
              // out.print(array[j]);
            }
            for(String x : crray)out.println(x);
           if(i!=test-1)
            out.println();
        }
    }
}

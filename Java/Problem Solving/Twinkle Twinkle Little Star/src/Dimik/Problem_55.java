package Dimik;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Problem_55 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number_of_elements = in.nextInt();
        int array [] = new int[number_of_elements];
        int multiply = 1;
        for(int i =0; i<number_of_elements;i++)
        {
            array[i]= in.nextInt();
            multiply*=array[i];

        }
        for (int i = 0; i <number_of_elements ; i++) {
            if(i==number_of_elements-1) {
                out.println(multiply / array[i]);
                break;
            }
            out.print(multiply/array[i]+" ");
        }
    }
}

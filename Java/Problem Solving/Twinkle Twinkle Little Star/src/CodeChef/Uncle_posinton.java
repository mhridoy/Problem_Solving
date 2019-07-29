package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Uncle_posinton {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int number = in.nextInt();
            long array []= new long[number];
            for (int i = 0; i <number ; i++) {
                array[i]= in.nextLong();
            }
            int position=in.nextInt()-1;
            long uncle_position = array[position];
            Arrays.sort(array);
            int index=0;
            for (int i = 0; i <number ; i++) {
                if(uncle_position==array[i]){
                    index=i;
                    break;
                }
            }
            out.println(index+1);
        }
    }
}

package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BIrohaLovesStringsABCEdition {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int row = in.nextInt();
        int col = in.nextInt();
        String array [] = new String[row];
        for (int i = 0; i <row ; i++) {
            array[i]= in.next();
        }
        Arrays.sort(array);
        String temp="";
        for (int i = 0; i <row ; i++) {
            temp+=array[i];
        }
        out.print(temp);
    }
}

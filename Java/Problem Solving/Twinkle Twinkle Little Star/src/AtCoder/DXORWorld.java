package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DXORWorld {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long xor =0;
        ArrayList<Long> array = new ArrayList<>();
        for (long i = a; i <=b ; i++) {
          xor+=i;
        }
        for (int i = 0; i <array.size()-1 ; i++) {
          xor^=  array.get(i)^array.get(i+1);
        }
        out.println(((xor/a+b)^a)+2);
    }
}

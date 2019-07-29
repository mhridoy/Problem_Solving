package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class AReachableNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int x = in.nextInt();
        HashSet <Integer> arr = new HashSet<>();
        while (!arr.contains(x)){
            arr.add(x);
            x=func(x);
        }
        out.print(arr.size());

    }

    private int func(int x) {
        x++;
        while (x % 10 == 0) x /= 10;
        return x;
    }
}

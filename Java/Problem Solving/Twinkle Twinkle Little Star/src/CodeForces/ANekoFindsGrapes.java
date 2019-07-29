package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ANekoFindsGrapes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt(),m = in.nextInt();
    int odd=0,even=0,odd1=0,even1=0;
        for (int i = 0; i <n ; i++) {
            int x = in.nextInt();
            if(x%2!=0)odd++;
            else even++;
        }
        for (int i = 0; i <m ; i++) {
            int y = in.nextInt();
            if(y%2!=0)odd1++;
            else even1++;
        }
        out.println((Math.min(odd,even1)+Math.min(odd1,even)));
    }
}

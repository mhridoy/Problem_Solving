package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BUglyPairs {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
   int test = in.nextInt();
   while (test--!=0)
   {
       char line[] = in.next().toCharArray();
       for (int i = 0; i <line.length-1 ; i++) {
           if((line[i]-'0') <(line[i+1]-'0')) {
               char temp = line[i];
               line[i] = line[i+1];
               line[i+1] = temp;
           }
       }
       out.println(line);
   }
    }
}

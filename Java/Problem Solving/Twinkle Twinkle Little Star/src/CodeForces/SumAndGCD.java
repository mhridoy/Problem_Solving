package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class SumAndGCD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int test = in.nextInt();
        while (test--!=0){
            int n = in.nextInt();
            int a[] = new int[n+1];
            for (int i = 1; i <=n; i++) {
                a[i]= in.nextInt();
            }
            ArrayList<Integer>b = new ArrayList<>();
            b.add(-1);
            Arrays.sort(a);
            for (int i = 1; i <=n ; i++) {
                if(a[i]!= a[i-1]){
                    b.add(a[i]);
                }
            }
            n=b.size()-1;
            if(b.get(1)==b.get(n-1)){
                out.println(b.get(1)+b.get(n));
            }
            else{
                int pfx[] = new int[n+2],sfx[]= new int[n+2];
                pfx[0]=0;
                sfx[n+1]=0;
                for(int i = 1; i < n; i++) {
                    pfx[i] = gcd(pfx[i - 1], b.get(i));
                }
                for(int i = 1; i <= n; i++) {
                    sfx[i] = gcd(sfx[i + 1], b.get(i));
                }
                int max_ans = 0;
                for(int i = 1; i <= n; i++) {
                    int cand = gcd(pfx[i - 1], sfx[i + 1]) + b.get(i);
                    max_ans = Math.max(cand, max_ans);
                }
                out.println(max_ans-1);
            }
        }
    }
    public static int gcd(int num1, int num2) {
        if (num2 != 0){
            return gcd(num2, num1 % num2);
        } else{
            return num1;
        }
    }
}

package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;


public class LOnePrime {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x = in.nextInt();
        while (x-- != 0) {
            long n = in.nextLong();
            if (isPrime(n))
                out.println("Prime");
            else
                out.println("Not");
        }
    }
    public static boolean isPrime(long num){
        if ( num > 2 && num%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

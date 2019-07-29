package cses.fi;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeJam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int test_case=0;
       while (test--!=0)
       {
           String line = in.next();
           BigInteger n = new BigInteger(line);
           if(n.equals(BigInteger.valueOf(4)))
               System.out.println(String.format("Case #%d: 2 2",++test_case));
           else {
               int count=line.length();
               String temp ="";
               for (int i = 0; i <count ; i++) {
                   temp+="3";
               }
               BigInteger b = new BigInteger(temp);
               BigInteger a = (n.subtract(b));
              System. out.println("Case #"+(++test_case)+": "+a+" "+b);
           }
       }
    }
}

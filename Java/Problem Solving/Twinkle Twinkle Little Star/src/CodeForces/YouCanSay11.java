package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class YouCanSay11 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()){
            String num = in.next();
            if(num.equals("0"))break;
            int sum=0;
            for (int i = 0; i <num.length() ; i++) {
                if(i%2==0){
                    sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
                    //out.print("+ "+num.charAt(i));
                }
                else{
                   sum-=Integer.parseInt(String.valueOf(num.charAt(i)));
                    //out.print("- "+num.charAt(i));
                }
            }
            //out.print(sum);
            if(sum%11==0)
                out.println(String.format("%s is a multiple of 11.",num));
            else
                out.println(String.format("%s is not a multiple of 11.",num));
        }
    }

}

package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class MobileSMS {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int testcase= in.nextInt();
        while(testcase-- !=0)
        {
            String a =".,?\"";
            String b = "abc";
            String c ="def";
            String d = "ghi";
            String e ="jkl";
            String f ="mno";
            String g ="pqrs";
            String h ="tuv";
            String i ="wxyz";
            String j =" ";
            int lengthOfMessage = in.nextInt();
            int array [] = new int[lengthOfMessage];
            for (int index =0; index< lengthOfMessage;index++)
                array[index]=in.nextInt();
            int timesTyping [] = new int[lengthOfMessage];
            for(int index =0 ; index<lengthOfMessage;index++)
                timesTyping[index]= in.nextInt();

            String temp="";
            int count=0;
            for (int k = 0; k <lengthOfMessage ; k++) {
                if(array[k]==1)
                {
                    temp+=a.charAt(timesTyping[k]-1);
                    //count++;
                }
                else if(array[k]==2)
                {
                    temp+=b.charAt(timesTyping[k]-1);
                    //count++;
                }
                else if(array[k]==3)
                {
                    //count++;
                    temp+=c.charAt(timesTyping[k]-1);
                }
                else if(array[k]==4) {
                    //count++;
                    temp += d.charAt(timesTyping[k] - 1);
                }
                else if(array[k]==5) {
                    //count++;
                    temp += e.charAt(timesTyping[k] - 1);
                }
                else if(array[k]==6)
                {
                    //count++;
                    temp+=f.charAt(timesTyping[k]-1);
                }
                else if(array[k]==7)
                {
                    //count++;
                    temp+=g.charAt(timesTyping[k]-1);
                }
                else if(array[k]==8)
                {
                    //count++;
                    temp+=h.charAt(timesTyping[k]-1);
                }
                else if(array[k]==9)
                {
                    //count++;
                    temp+=i.charAt(timesTyping[k]-1);
                }
                else if(array[k]==0)
                {
                    //count++;
                    temp+=j.charAt(timesTyping[k]-1);
                }
            }
            out.println(temp);

        }
    }
}
class SMS{
    public  static int number;
    public  static int times;
}

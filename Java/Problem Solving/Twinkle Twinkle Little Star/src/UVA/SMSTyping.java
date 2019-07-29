package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SMSTyping {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int testcase = in.nextInt();
        int index = 0;
        while (testcase-- != 0) {

            //String keyboard= ".,?\"abcdefghijklmnotuvwxyz ";
            String line = in.nextLine();
            //int count = 0;
            //out.println(line);

            out.println(String.format("Case #%d: %d", ++index, count_how_many_times(line, out)));


        }
    }


    private int count_how_many_times(String input, PrintWriter out) {
       /* String b = "abc";
        String c = "def";
        String d = "ghi";
        String e = "jkl";
        String f = "mno";
        String g = "pqrs";
        String h = "tuv";
        String i = "wxyz";
        String j = " ";*/
        int count = 0;//welcomes
        for (int k = 0; k < input.length(); k++) {

            if(input.charAt(k)=='a'||input.charAt(k)=='d'||input.charAt(k)=='g'||input.charAt(k)=='j'
            ||input.charAt(k)=='m'||input.charAt(k)=='p'||input.charAt(k)=='t'||input.charAt(k)=='w')count++;
            else if(input.charAt(k)=='b'||input.charAt(k)=='e'||input.charAt(k)=='h'||input.charAt(k)=='k'||input.charAt(k)=='n'
            ||input.charAt(k)=='q'||input.charAt(k)=='u'||input.charAt(k)=='x')count=count+2;
            else if(input.charAt(k)=='c'||input.charAt(k)=='f'||input.charAt(k)=='i'||input.charAt(k)=='l'||input.charAt(k)=='o'
            ||input.charAt(k)=='r'||input.charAt(k)=='v'||input.charAt(k)=='y')count=count+3;
            else if(input.charAt(k)=='z' ||input.charAt(k)=='s')count=count+4;
            else if ( input.charAt(k)==' ' )
                count++;

            /* // out.println(count);
            for (int l = 0; l < b.length(); l++) {
                if (b.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < c.length(); l++) {
                if (c.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < d.length(); l++) {
                if (d.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < e.length(); l++) {
                if (e.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < f.length(); l++) {
                if (f.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < g.length(); l++) {
                if (g.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < h.length(); l++) {
                if (h.length() == input.charAt(k)) count = (count + l) + 1;
            }
            //out.println(count);
            for (int l = 0; l < i.length(); l++) {
                if (i.charAt(l) == input.charAt(k)) count = (count + l) + 1;
            }*/

            //out.println(count);

        }
        //out.println(count);


        return count;

    }

}


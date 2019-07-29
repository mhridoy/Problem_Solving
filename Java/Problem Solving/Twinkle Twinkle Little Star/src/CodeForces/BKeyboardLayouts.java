package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BKeyboardLayouts {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String first_layout= in.nextLine();
        String second_layout = in.nextLine();
        String text = in.nextLine();
        String a=first_layout.toLowerCase();
        String b =second_layout.toLowerCase();
        String c = text.toLowerCase();
        int press[] = new int[text.length()];

        int index=0;

        for (int i = 0; i <c.length() ; i++) {
            if((c.charAt(i)>=48 &&c.charAt(i)<=57 ))
                out.print(c.charAt(i));
            for (int j = 0; j <a.length() ; j++) {
                if(a.charAt(j)==c.charAt(i))
                {
                    if(isUpperCase(text.charAt(i)))
                    {
                        if(text.charAt(i)>=48 &&text.charAt(i)<=57)
                            out.print(c.charAt(j));
                        else
                            out.print(convertUpperCase(b.charAt(j)));
                    }

                    else
                        out.print(b.charAt(j));
                }
            }
        }
        out.println();
        /*for (int i = 0; i <press.length ; i++) {
            if((text.charAt(i)>=48 &&text.charAt(i)<=57 ))
                out.print(c.charAt(i));
            else if(isUpperCase(text.charAt(i)))
            {
                if(text.charAt(i)>=48 &&text.charAt(i)<=57)
                    out.print(c.charAt(i));
                else
                out.print(convertUpperCase(b.charAt(press[i])));
            }

            else
            out.print(b.charAt(press[i]));

        }*/
    }
    static boolean isUpperCase (char c ){
        if(c>=65 && c<=90)
            return true;
        else
            return false;
    }
    static char convertUpperCase  (char c )
    {
        c= (char) (c-32);
        return c;
    }
}

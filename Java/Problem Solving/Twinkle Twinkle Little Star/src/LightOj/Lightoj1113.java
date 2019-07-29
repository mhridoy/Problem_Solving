package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Lightoj1113 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        for (int i = 1; i <=test ; i++) {
            out.println(String.format("Case %d",i));
            List<String> push = new ArrayList<>();
            push.add("http://www.lightoj.com/");
            int current_page=0;
            while(in.hasNext())
            {
                String line = in.next();
                if(line.equals("QUIT")) break;
                 if (line.equals("VISIT"))
                {
                    String input = in.next();
                    push.add(input);
                    out.println(input);
                }
                 if(line.equals("BACK"))
                {
                    out.println(current_page);
                    if(current_page<0)
                        out.println("Ignored");
                    else
                    out.println(push.get(current_page));
                }
                 /*if(line.equals("FORWARD"))
                 {
                     ++current_page;
                     if(current_page>push.size())
                         out.println("Ignored");
                     else
                         out.println(push.get(current_page));
                 }*/

            }

        }
    }
}

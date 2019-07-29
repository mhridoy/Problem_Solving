package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class DecodingBabyBoos {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            String baby_sound = in.nextLine();
            int replace = in.nextInt();
            while(replace-- !=0)
            {
                char old = in.next().charAt(0);
                char nnew = in.next().charAt(0);
                if(old==nnew)continue;
                else
                {
                    baby_sound=baby_sound.replace(nnew,old);
                }
            }
            out.println(baby_sound);
        }
    }

    private String Replace(char old, char nnew, String baby_sound) {
        String temp="";
        for (int i = 0; i <baby_sound.length() ; i++) {
            if(baby_sound.charAt(i)==nnew)temp+=old;
            else
                temp+=baby_sound.charAt(i);
        }
        return temp;
    }
}

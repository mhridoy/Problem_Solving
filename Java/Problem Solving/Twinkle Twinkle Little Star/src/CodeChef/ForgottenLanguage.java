package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ForgottenLanguage {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case =in.nextInt();
        while (test_case--!=0)
        {
            int no_of_words_acquired_from_forgotten_language = in.nextInt();
            int no_of_words_used_modern_language = in.nextInt();
            String forgotten_language[] = new String[no_of_words_acquired_from_forgotten_language];
            ArrayList<String> moderLanguage  = new ArrayList<>();
            int index=0;
            for(int i =0; i<no_of_words_acquired_from_forgotten_language;i++)forgotten_language[i]= in.next();
            for(int i =0; i<no_of_words_used_modern_language;i++)
            {   int no_of_words= in.nextInt();
                String the_phrase [] = new String[no_of_words];
                for(int j =0; j<no_of_words;j++) {
                    the_phrase[j]= in.next();
                    moderLanguage.add(the_phrase[j]);
                }


            }
            for (int i = 0; i <no_of_words_acquired_from_forgotten_language ; i++) {
                if((check_word_is_dead_or_not(moderLanguage.size(),moderLanguage,forgotten_language[i])))
                {
                    if (i == no_of_words_acquired_from_forgotten_language - 1)
                        out.println("YES");
                    else
                        out.print("YES ");
                }
                else
                    {
                    if (i == no_of_words_acquired_from_forgotten_language - 1)
                        out.println("NO");
                    else
                        out.print("NO ");
                }
            }
        }
    }
static boolean check_word_is_dead_or_not(int no_of_words,ArrayList the_phrase, String forgotten_language) {
        for (int i = 0; i <no_of_words ; i++) {
            if(forgotten_language.equals(the_phrase.get(i)))
                return true;
        }
        return false;
    }
}

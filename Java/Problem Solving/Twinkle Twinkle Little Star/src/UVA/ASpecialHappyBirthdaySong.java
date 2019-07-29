package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ASpecialHappyBirthdaySong {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        String nameList [] = new String[test];
        for(int i =0; i<test;i++)
        {
            nameList[i]= in.nextLine();

        }
        String song= "Happy birthday to you! Happy birthday to you! Happy birthday to Rujia! Happy birthday to you!!!";
        String song_word_with_Exclamation_Sign[] = song.split("!");
        String temp_song =convertString(song_word_with_Exclamation_Sign);
        String song_word_without_Ex[] =temp_song.split(" ");
        int index=0;
        if(test<16)
            play_the_music(index,nameList,song_word_without_Ex,out);
        else {
            int how_many_times_play = test / 16;
            int ans= test % 16;
            if(ans!=0)
                how_many_times_play++;
            for (int i = 0; i < how_many_times_play; i++) {
                play_the_music(index, nameList, song_word_without_Ex, out);
                index = song_word_without_Ex.length;

            }
        }

    }

    private void play_the_music(int index, String[] nameList, String[] song_word_without_ex, PrintWriter out) {
        for (int i = 0; i <song_word_without_ex.length ; i++) {

            out.println(nameList[index++]+":"+" "+song_word_without_ex[i]);
            if(index==nameList.length)index=0;
        }
    }

    private String convertString(String[] song_word_with_exclamation_sign) {
        String temp="";
        for(String s : song_word_with_exclamation_sign)
            temp+=s;
        return temp;
    }
}

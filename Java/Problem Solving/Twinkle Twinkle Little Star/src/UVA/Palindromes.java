package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Palindromes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext())
        {
            String text = in.next();
            //out.println("Mirror Check : "+mirrorString(text));
            if(palindrome(text) && mirrorString(text))
            out.println(text+" -- is a mirrored palindrome.\n");
            else if(!palindrome(text) && mirrorString(text))
                out.println(text+" -- is a mirrored string.\n");
            else if(palindrome(text) && !mirrorString(text))
              out.println(text+" -- is a regular palindrome.\n");
            else
                out.println(text+" -- is not a palindrome.\n");
            //out.println();
        }
       //out.println();
    }

    private boolean mirrorString(String text) {
        {
            String temp ="";

            //boolean flag =false;
            for (int i = 0; i <text.length() ; i++) {

                if(text.charAt(i)=='A')
                    temp+='A';
                else if (text.charAt(i)=='H')
                    temp+='H';
                else if(text.charAt(i)=='I')
                    temp+='I';
                else if(text.charAt(i)=='M')
                    temp+='M';
                else if(text.charAt(i)=='O')
                    temp+='O';
                else if(text.charAt(i)=='T')
                    temp+='T';
                else if(text.charAt(i)=='U')
                    temp+='U';
                else if(text.charAt(i)=='V')
                    temp+='V';
                else if(text.charAt(i)=='X')
                    temp+='X';
                else if(text.charAt(i)=='W')
                    temp+='W';
                else if(text.charAt(i)=='Y')
                    temp+='Y';
                else if(text.charAt(i)=='1')
                    temp+='1';
                else if(text.charAt(i)=='8')
                    temp+='8';
                else if(text.charAt(i)=='E')
                {
                    temp+='3';
                    //flag=true;
                }
                else if(text.charAt(i)=='3'){
                    temp+='E';
                    //flag=true;
                }
                else if(text.charAt(i)=='J')
                {
                    temp+='L';
                    //flag=true;
                }
                else if(text.charAt(i)=='L'){
                    temp+='J';
                    //flag=true;
                }
                else if(text.charAt(i)=='S')
                {
                    temp+='2';
                    //flag=true;
                }
                else if(text.charAt(i)=='2')
                {
                    temp+='S';
                    //flag=true;
                }
                else if(text.charAt(i)=='Z')
                {
                    temp+='5';
                    //flag=true;
                }
                else if(text.charAt(i)=='5')
                {//
                    temp+='Z';
                    //flag=true;
                }
                else
                {
                    return false;
                }
            }
            //if(!flag) return false;
            //System.out.println("Temp : "+temp);
           // System.out.println("Reverse : "+reverseString(text));
            if(temp.equals(reverseString(text)))
                return true;
            else return false;
        }
    }

    private String reverseString(String text) {
        String temp ="";
        for (int i = text.length()-1; i >=0 ; i--) {

            temp+=text.charAt(i);
        }
        return temp;
    }


    private boolean palindrome(String text) {
        String temp ="";
        for (int i = text.length()-1; i >=0 ; i--) {

            temp+=text.charAt(i);
        }
        if(temp.equals(text))
            return true;
            else
                return false;
    }
}

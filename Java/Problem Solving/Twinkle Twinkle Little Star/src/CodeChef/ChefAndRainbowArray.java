package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class ChefAndRainbowArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();
        while (test_case--!=0)
        {
            int size_of_array = in.nextInt();
            int array[] = new int[size_of_array];
            int index =0;
            int count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count_6=0,count_7=0;
            int bount_1=0,bount_2=0,bount_3=0,bount_4=0,bount_5=0,bount_6=0;
            boolean flag =false;
            for (int i = 0; i <size_of_array ; i++) {
                array[i]=in.nextInt();
                if(array[i]==7)
                    index=i;
                else if(array[i]>7)flag=true;
            }
            for(int i =0; i<=index;i++)
            {
                if(array[i]==1)count_1++;
                else if(array[i]==2)count_2++;
                else if(array[i]==3)count_3++;
                else if(array[i]==4)count_4++;
                else if(array[i]==5) count_5++;
                else if(array[i]==6)count_6++;
                else if(array[i]==7)count_7++;
            }

            for(int i =index+1; i<size_of_array;i++)
            {
                 if(array[i]==1)bount_1++;
                else if(array[i]==2)bount_2++;
                else if(array[i]==3)bount_3++;
                else if(array[i]==4)bount_4++;
                else if(array[i]==5)bount_5++;
                else if(array[i]==6)bount_6++;

            }
            if((count_1!=0  &&count_2!=0 && count_3!=0 && count_4!=0 && count_5!=0 && count_6!=0 && count_7!=0) && (count_1==bount_1 && count_2==bount_2 && count_3==bount_3 && count_4==bount_4
             && count_5== bount_5 && count_6==bount_6 &&flag==false ) )
                out.println("yes");
            else
                out.println("no");


        }
    }
}

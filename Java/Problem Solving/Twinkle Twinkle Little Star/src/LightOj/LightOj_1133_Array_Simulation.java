package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class LightOj_1133_Array_Simulation {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();
        int set=0;
        while(test_case-- !=0)
        {
            int elements_of_array = in.nextInt();
            int operations = in.nextInt();
            int array [] = new int[elements_of_array];
            for(int i =0; i< elements_of_array ; ++i)
                array[i] = in.nextInt();
            //in.nextLine();
            for(int i =0 ; i< operations ; ++i)
            {

                char letter = in.next().charAt(0);
                if(letter=='S')
                {
                    int element = in.nextInt();
                    add(array, element);
                }
               else if(letter=='M')
                {
                    int element = in.nextInt();
                    multiply(array,element);
                }
                else if(letter=='D')
                {
                    int element = in.nextInt();
                    divide(array,element);
                }
               else if(letter=='R')
                {
                    reverse (array);
                }
               else if(letter=='P')
                {
                    int y = in.nextInt();
                    int z = in.nextInt();
                    swap(array,y,z);
                }
            }
            System.out.println(String.format("Case %d:",++set));
            for (int i = 0; i <elements_of_array ; i++) {
                if(array.length-1==i)
                    System.out.println(array[i]);
                else
                    System.out.print(array[i]+" ");
            }


        }
    }

    static void swap(int[] array, int y, int z) {
        int temp = array[y];
        array[y] = array[z];
        array[z]= temp;
    }

    static  void reverse(int [] array)
    {
        int temp[] = new int[array.length];
        int index=0;
        for(int i =array.length-1 ; i>=0; i--)
        {
            temp[index++]= array[i];
        }
        for(int i = 0; i<index ;i++)
        {
            array[i]= temp[i];
        }

    }

    static  void divide(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (element == 0)
                array[i] = 0;
            else
                array[i] /= element;
        }
    }

    static  void add (int array [], int item)
    {
        for(int i =0; i< array.length;i++)
            array[i]+=item;
    }
    static  void multiply (int array [], int item)
    {
        for(int i =0; i< array.length;i++)
            array[i]*=item;
    }
}

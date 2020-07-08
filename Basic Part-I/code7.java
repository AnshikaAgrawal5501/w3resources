//Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.io.*;
class code7
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter a no.");
        int n=Integer.parseInt (br.readLine());

        for (int i=1; i<=10; i++)
        {
            System.out.println (n+" X "+i+" = "+(n*i));
        }
    }
}
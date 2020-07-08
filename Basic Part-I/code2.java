//Write a Java program to print the sum of two numbers.

import java.io.*;
class code2
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int sum=a+b;
        System.out.println ("sum = "+sum);
    }
}
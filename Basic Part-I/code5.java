//Write a Java program that takes two numbers as input and display the product of two numbers.

import java.io.*;
class code5
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int pr=a*b;
        System.out.println ("product = "+pr);
    }
}
//Write a Java program to divide two numbers and print on the screen


import java.io.*;
class code3
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());

        int div=a/b;
        System.out.println ("divison = "+div);
    }
}
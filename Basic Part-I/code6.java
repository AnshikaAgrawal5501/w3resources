//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.io.*;
class code6
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter two no.");
        int a=Integer.parseInt (br.readLine());
        int b=Integer.parseInt (br.readLine());
        
        int sum=a+b;
        int sub=a-b;
        int pr=a*b;
        int div=a/b;
        int rem=a%b;
        
        System.out.println ("sum = "+sum);
        System.out.println ("subtraction = "+sub);
        System.out.println ("product = "+pr);
        System.out.println ("divison = "+div);
        System.out.println ("remainder = "+rem);
    }
}
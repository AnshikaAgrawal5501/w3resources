// Write a Java program to convert a octal number to a binary number.

import java.io.*;
class code26
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("Enter an octal no.");
        String oc=br.readLine ();

        String b[]={"000","001","010","011","100","101","110","111"};

        char ch;
        int c;
        
        System.out.println ("Binary no. -");
        for (int i=0; i<oc.length(); i++)
        {
            ch=oc.charAt(i);
            c=(int)ch;
            c=c-48;
            System.out.print (b[c]);
        }
    }
}
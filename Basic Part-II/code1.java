/**
 * Write a Java program to find the value of specified expression. 
a) (101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)
 */

import java.io.*;
class code1
{
    public static void main ()
    {
        System.out.println ("a) (101 + 0) / 3"+((101+0)/3));
        System.out.println ("b) 3.0e-6 * 10000000.1"+(3.0e-6*10000000.1));
        System.out.println ("c) true && true"+(true&&true));
        System.out.println ("d) false && true"+(false&&true));
        System.out.println ("e) (false && false) || (true && true)"+((false&&false)||(true&&true)));
        System.out.println ("f) (false || false) && (true && true)"+((false||false)&&(true&&true)));
    }
}
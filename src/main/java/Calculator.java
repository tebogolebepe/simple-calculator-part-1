import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]) {
        System.out.println("Sum = " +sumofnum(20,40));
        System.out.println("Sum = " + sumofnum1(2,3,4));
        System.out.println("product = " + ProductOfNumbers(2,5));
        System.out.println("Product = " + ProductOfNumbers1(5,2,4));


    }

   public static int sumofnum(int a, int n) {
        int sum = 0;

       sum = a+n;


        return sum;
    }
    public static int sumofnum1(int a, int b, int c)
    {
        int sum1;
        sum1 = a+b+c;

        return sum1;
    }
public static int ProductOfNumbers(int a,int b)
{
    int product = 0;

    product = a * b;

    return  product;
}
public static int ProductOfNumbers1(int a,int b,int c)
{
    int product = 0;
    product = a*b*c;

    return  product;
}
}



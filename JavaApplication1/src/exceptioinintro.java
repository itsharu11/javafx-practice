/*

In java runtime error is called an exception. Java handles exception by five keywords 'try', 'catch', ' finally', 'throw', 'throws'
try- This block is used when any line generate exception. Every try is followed by catch block. one try can have more than one catch block.
catch- this block is caught the exception generated in try block.
finally - this block is used when you want to execute the code refardless of exception.
throw - It is used when we want to generate exception explicitly.
throws - it is used to avoid try catch block in method.
Exception is handled by exception class. It is the super class of all exception.


*/
import java.util.*;

public class exceptioinintro {


    public static void main(String args[]) {
    int a[] = new int[3];
    Scanner s = new Scanner(System.in);
    try{
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter values");
            a[i] = s.nextInt();
        }
        double c = a[0]/a[1];
        System.out.println("Division = "+c);
        }  
    catch(ArrayIndexOutOfBoundsException e) // specific exception can be used.
    {
        System.out.println("You entered more data than your size");
    }
    catch(InputMismatchException e) // specific exception can be used.
    {
        System.out.println("You entered alhpabets");
    }
    catch(ArithmeticException e) // specific exception can be used.
    {
        System.out.println("A1 must be non zero");
    }
    }
}
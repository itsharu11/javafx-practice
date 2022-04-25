/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
import java.util.Scanner;
public class arrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a[] = new int[5];
        //-----------------------------------IMPORTANT The new keyword is used to allocate memory to the variable, and it will return 0 as value
        // ----------------------------------The new keyword cannot be used for variables and variables must be initailized.
        
       //int b[] = new int[1];
        Scanner s = new Scanner(System.in);
       /* 
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter number "+ i);
             a[i] = s.nextInt();
        }
*/
        for(int i=0;i<5;i++)
        {
            System.out.println("Number "+ a[i]);
       //     System.out.println("Number "+ b[0]);
             
        }
    }
}

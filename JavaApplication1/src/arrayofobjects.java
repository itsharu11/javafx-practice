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
class studentinfo
{
    String name;
    int age;
    studentinfo()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name : ");
        name = s.nextLine();
        System.out.println("Enter student age : ");
        age = s.nextInt();
        
    }
    public void detail()
    {
        System.out.println(" Name : " + name);
        System.out.println(" Age  : " + age);
        
    }
}
public class arrayofobjects {


    public static void main(String args[]) {
        // int a[] = new int[5]; array
        studentinfo si[] = new studentinfo[3]; // creating array of objects
        for(int i=0;i<3;i++)
        {
            si[i] = new studentinfo(); // creating an object
            si[i].detail();
        }
    }
}

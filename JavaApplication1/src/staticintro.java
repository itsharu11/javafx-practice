/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
class staticdemo{ //default visibility
    
    static int a = 5; 
    //private static int a = 5; // private cannot access it area
    //protected static int a = 5; // protted can access it area
    static int b = 50;
    public static void addition()
    {
        int c = a + b;
        System.out.println("Addition = "+ c);
    }
}
        
public class staticintro extends staticdemo{
    static int a = 7;
    static int b = 10;
    
    public static void main(String args[]) {
      staticdemo.addition(); // static method can call by its class name
      sub();
      
    }
    public static void sub()
    {
        int c = staticdemo.b - staticdemo.a;            // accesses variables of class staticdemo with its specific access modifiers
        System.out.println("Subtraction= "+ c);
       // int c = b - a;                                // this values are local
        //System.out.println("Subtraction= "+ c);
    }
}

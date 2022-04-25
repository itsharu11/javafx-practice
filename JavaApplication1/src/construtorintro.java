/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
class mathop
{
    int a,b;
    double d;
    mathop()
    {
        System.out.println("Default constructor");
        a=0;
        b=0;
        
    }
    mathop(int a, int b)
    {
        this.a=a;
        this.b=b;
        //this is a local object of a class
        // this is used only in non static method 
        
    }
    mathop(double m)
    {
        d = m;
    }
    public void valueAB()
    {
        System.out.println("A = "+a + " B= "+ b);
        
    }
    public void addition()
    {
        int c = a + b;
        System.out.println("Addition = "+ c);
        int max = Math.max(a, b);
        System.out.println("Max = " + max);
        
    }
    public void area()
    {
        double ar = Math.PI * (Math.pow(d, 2.0));
        System.out.println("Area is = " + ar);
        
    }
    // passsing object as a parameter
    public void sub(mathop x)
    {
        int c = x.a - x.b ;
        System.out.println("Subtraction = "+ c);
    }
}

       

public class construtorintro {

    
    public static void main(String args[]) {
    mathop mop = new mathop(); // Default constructor is called.
    mathop para = new mathop(1,2); // parameterized constructor is called.
    mathop db = new mathop(3.0); // Single parameterized constructor.
    
    // Using object methods are called.
    
    mop.valueAB();
    para.valueAB();
    
    mop.addition();
    para.addition();
    
    
    db.area();
    
    mop.sub(para);
    
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
// Java does not support multiple inheritance
// One class is inherited by the other class using extends keyword
// A class inherit the other class is called sub class and inherited class is called super class
// Sub class can access all the members except private member of the super class.
// The object of sub class can call all the methods and data members super class

class parent{
    public void display()
    {
        System.out.println("I am parent class");
    }
    protected void display_protected()
    {
        System.out.println("I am parent class protected");
        
        display_private(); //private method can only be acccessed inside the class 
        
    }
    private void display_private()
    {
        System.out.println("I am parent class private");
    }
    
}
class child extends parent{
    public void show()
    {
        System.out.println("I am child class");
    }
}
public class inheritanceintro {

    
    public static void main(String args[]) {
        child c = new child();
        c.show();
        c.display();
        c.display_protected();
        // c.display_private(); cannot access private member of parent class
        
        
        
        
    }
}

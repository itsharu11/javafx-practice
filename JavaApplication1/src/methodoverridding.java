/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
class pc{
    public void display()
    {
        System.out.println("Parent class");
    }
}
class cc extends pc{
    public void display()
    {
        System.out.println("child class");
    }
}

public class methodoverridding {

    public static void main(String args[]) {
        cc c = new cc();
        // all object must be declared to use reference. the reference then will be initiazlied according to the object eg  ref = c;  
        //c.display();
        pc ref; // Create a refernce of parent class and passing the object of parent and child class to access the overriding method which is called dynamic method dispatch.
        pc p = new pc();
        ref = p;    // ref is used to typecast the datatype of pc class and c class.
        ref.display(); 
        ref = c;   
        ref.display();
    }
}

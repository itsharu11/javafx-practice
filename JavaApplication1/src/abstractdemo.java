/*

In java abstraction is handled by abstract keyword.
Abstract class cannot be instantiated. It must be inherited by other class.
If the methods is absract in a class then class must be declared as abstract but if the class is abstract then it may or may not contain abstract method.
abstract methods must be overriden by sub class.
*/
abstract class demo{
 //   abstract void add(int a,int b);
    public void dis()
    {
        System.out.println("Jai Shree Ram");
    }
}
class subabstract extends demo{
    void add(int a ,int b){
        int c = a + b;
        System.out.println("addition is " + c);
    }
}
public class abstractdemo {


    public static void main(String args[]) {
        subabstract s = new subabstract();
        s.add(1, 2);
        //demo d = new demo();
    }
}

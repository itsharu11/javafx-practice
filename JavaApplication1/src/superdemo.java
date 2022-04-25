/*

1. Super is keyword which refers super class.
2. Super{} is a constructor of super class. It is always the first line of a "child" constructor.
3. Super.vairable is a instace of super class.

*/
class gp{
    int b =0, c=1;
    
    gp()
    {
        System.out.println("Grand parent");
    }
    gp(int a)
    {
        System.out.println("Grand parent " + a);
    }
}
class p extends gp{
    int b =2, c=3;
    p()
    {
        System.out.println("parent");
    }
    p(int a)
    {
        super(a);
        System.out.println("Parent" + a);
    }
}
class c extends p{
    int b =6, c=7;
    c()
    {
        System.out.println("Child ");
    }
    c(int a)
    {
        super(a);
        System.out.println("Child " + a);
    }
    public void display()
    {
        System.out.println("B = " + b + " C = " + c);
        System.out.println("B = " + super.b + " C = " + super.c);
    }
}

public class superdemo {

  
    public static void main(String args[]) {
       c co = new c();
       c co1 = new c(5); // only default constructor is called other parameteriezed constructor must be explicitly called.
       co.display();
    }
}

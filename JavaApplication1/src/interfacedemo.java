/*
    Interface is a fully abstract class. We can define interface by interface keyword.
    We cannot instantiate interface
    All the methods in interface are abstract methods(has to override in subclass)
    Variables in interface becomes constant.
    One interface extends the other interface but one class implements other interface
    interface supports multiple inheritance in java.
*/
interface inter1{
    public void show();
}
interface inter2 //extends inter1
{
    public void msg();
}
class interinfo implements inter2,inter1{

    @Override
    public void msg() {
        System.out.println("Methods of inter 2 class");
    }

    @Override
    public void show() {
        System.out.println("Methods of inter 1 class");
    }
    
}
public class interfacedemo {

   
    public static void main(String args[]) {
        interinfo i = new interinfo();
        i.show();
        i.msg();
    }
}

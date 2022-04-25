
class methdef
{
    public void display()
    {
        System.out.println("Display method");
    }
    public void even(int n)
    {
        if(n%2 == 0)
            System.out.println(n+" Even");
        else
            System.out.println(n+" Odd");
    }
    public int fact(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac = fac * i;
        }
        return fac;
    }
    public void addition(int a,int b)
    {
        System.out.println("Addition = "+(a+b));
    }
}


public class classIntro {
  
    public static void main(String args[])
    {
        // create the object of the other class
        methdef md = new methdef();
        // call the methods of the other class by its object.
        md.display();
        md.even(23);
        int f = md.fact(4);
            System.out.println("Factorial = "+ f);
        md.addition(35,25);
    }
}

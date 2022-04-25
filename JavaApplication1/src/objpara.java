class pass
{

    public void disp()
    {
     System.out.println("Hello");
    }
    public void pass_obj(pass o)
    {
     o.disp();
    }
}

public class objpara
{
    
    public static void main(String args[])
    {
        pass o = new pass();
        o.pass_obj(o);       
    }

}
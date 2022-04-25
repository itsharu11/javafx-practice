import java.lang.Exception;
class ex extends Exception
{
    ex(String msg)
    {
        super(msg);
    }
}

public class customexception{

    public static void main(String args[]) {
        int age = 15;
        try
        {
            if(age<21)
                throw new ex("your age is very less than the condition");
        }
        catch(ex e)
        {
            System.out.println("This is my exception block");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block end of the program");
        }
    }
}

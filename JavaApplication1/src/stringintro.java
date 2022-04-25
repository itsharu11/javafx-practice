import java.util.*;
class stringdemo{
    public void display()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string 1 ");
        String s1 = s.nextLine();
        String m = String.valueOf(123);
        int l = s1.length();
        if(l<8)
        {
            System.out.println("String have atleast 8 characters");
        }
        System.out.println(s1.charAt(2));
        System.out.println("Enter a string 2 ");
        String s2 = s.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("String are equal ");
        }
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("String are equal ignore case ");
        }
        System.out.println("Concatenation " + s1.concat(s2));
        System.out.println("Upper case " + s1.toUpperCase());
        System.out.println("Lowe case" + s2.toLowerCase());
        String sub = s1.substring(0,4);
        System.out.println("sub string "+ sub);
        
    }
}
public class stringintro {

    public static void main(String args[]) {
        stringdemo sd = new stringdemo();
        sd.display();
    }
}

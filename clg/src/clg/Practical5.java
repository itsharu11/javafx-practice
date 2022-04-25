import java.util.Scanner;
public class Practical5
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = reader.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = reader.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = reader.nextInt();
        if (n1>=n2 && n1>=n3 && n2>=n3)
        {
            System.out.println("The decreasing order: " + n1 + " | " + n2 + " | " + n3 );
        }
        else if (n1>=n2 && n1>=n3 && n3>=n2)
        {
            System.out.println("The decreasing order: " + n1 + " | " + n3 + " | " + n2 );
        } 
        else if (n2>=n1 && n2>=n3 && n1>=n3)
        {
            System.out.println("The decreasing order: " + n2 + " | " + n1 + " | " + n3 );
        }
        else if (n2>=n1 && n2>=n3 && n3>=n1)
        {
            System.out.println("The decreasing order: " + n2 + " | " + n3 + " | " + n1 );
        }
        else if (n3>=n1 && n3>=n2 && n1>=n2)
        {
            System.out.println("The decreasing order: " + n3 + " | " + n1 + " | " + n2 );
        }
        else 
        {
            System.out.println("The decreasing order: " + n3 + " | " + n2 + " | " + n1 );
        }
        System.out.println("Above are the numbers in decreasing order. ");
    }
}

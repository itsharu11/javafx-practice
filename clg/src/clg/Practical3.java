import java.util.Scanner;
public class Practical3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in meters : ");
        double meter = input.nextDouble();
        double feet = meter * 3.28084;
        System.out.println(meter + "m = " + feet + "feet");
    }
}

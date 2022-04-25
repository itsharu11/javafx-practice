import java.util.Scanner;
public class Practical4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pound: ");
        double pound = input.nextDouble();
        System.out.print("Enter your height in foot: ");
        double inch = input.nextDouble();
        double BMI = (pound*0.45359237)/((inch*0.0254)*(inch*0.0254));
        System.out.print(" BMI " + BMI);
    }
}

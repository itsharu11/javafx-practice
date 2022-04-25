import java.util.Scanner;
public class Practical8
{
  public static void main(String[] args)
  {
    int div=2;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the Integer: ");
    int number = reader.nextInt();
    while(number > 1)
    {
      if(number%div==0)
      {
        System.out.print(div+" ");
        number=number/div;
      }
      else
      {
        div++;
      }
    }
  }
}


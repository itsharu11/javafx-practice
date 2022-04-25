import java.util.Scanner;
public class Practical6
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = reader.next().charAt(0);
        if(Character.isLetter(ch))
        {
        switch(Character.toLowerCase(ch))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("The entered character is a vowel. ");
            break;
            default:
            System.out.println("The entered character is a consonant: ");
        }
        }
        else
        {
            System.out.println("The entered character is invalid");
        }
    }
}

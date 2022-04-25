import java.util.Scanner;
class Fraction{  
   private int real;
   private int imaginary;
   
   Fraction(int r,int img){
       real=r;
       imaginary=img;
   }
   public long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b);
   }
   public String toString() {
       long gcm = gcm(real, imaginary);
       return real/gcm+"/"+imaginary/gcm;
   }
}
public class Practical16 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Decimal Number: ");
       String decimal=sc.nextLine();
       int indexOfDecimal = decimal.indexOf(".");
       int len=decimal.substring(indexOfDecimal).length();
       int imag_part=(int) Math.pow(10,len-1);
       int real_part=(int)(Double.parseDouble(decimal)*imag_part);
       Fraction fr=new Fraction(real_part,imag_part);
       System.out.println("The Fraction Number is "+fr);
               System.out.print("Enter a Decimal Number: ");
               decimal=sc.nextLine();
               indexOfDecimal = decimal.indexOf(".");
               len=decimal.substring(indexOfDecimal).length();
               imag_part=(int) Math.pow(10,len-1);
               real_part=(int)(Double.parseDouble(decimal)*imag_part);
               fr=new Fraction(real_part,imag_part);
               System.out.println("The Fraction Number is "+fr);
   }
}

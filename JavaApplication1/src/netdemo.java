import java.net.*;
import java.io.*;
public class netdemo {

    public static void main(String args[]) {
        try{
            URL obj = new URL("https://www.yahoo.com");
            System.out.println("Protocol: ");
            URLConnection uc = obj.openConnection();
            int length;
            length = uc.getContentLength();
            if(length!=0)
            {
                System.out.println("\n\n-----------------------Content of webpage are : --------------------\n\n");
                InputStream is = uc.getInputStream();
                int ch;
                while((ch=is.read())!=-1)
                {
                    System.out.print((char)ch);
                }
                is.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}

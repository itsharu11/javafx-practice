import java.awt.*;
class frameintro extends Frame{
    @SuppressWarnings("OverridableMethodCallInConstructor")
    frameintro(String str){
        super(str);
        setSize(500,500);
        setVisible(true);
        
    }
}
public class framedemo {

    public static void main(String args[]) {
        frameintro fi = new frameintro("Notepad");
    }
}

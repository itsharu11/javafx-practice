class other extends studentinfo{
    public void callme()
    {
        detail();
        
    }
}

public class inhotherclass {

    
    public static void main(String args[]) {
    other o = new other();
    o.callme();
    
    }
}

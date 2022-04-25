class outer
{
    public void display(Runnable r)
    {
        System.out.println("hello");
    }
    static class inner{
        
    }
}

class localouter{
    public void disp(int a){
        class localinner{
            
        }
    }
}
class myrun implements Runnable{
    public void run()
    {
        System.out.println("myrun");
    }
}        


public class innerclass {

    public static void main(String args[]) {
        outer o = new outer();
        /*
        o.display(new Runnable(){
            public void run(){
                 
            }
        });
*/
        myrun r = new myrun();
        o.display(r); 
    }
}

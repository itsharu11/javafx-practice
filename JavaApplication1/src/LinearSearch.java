/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        // TODO code application logic here
        int[] a ={1,5,-2,8,7,11,40,32};
        System.out.println("The element is at location "+Find(a,7));
        System.out.println("The element is at location "+Find(a,11));
    }
    public static int Find(int[] a,int key)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==key)
                return i+1;
        }
        return -1;
    }
}

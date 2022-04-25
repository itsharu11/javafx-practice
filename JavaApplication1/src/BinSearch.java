/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author upadh
 */
public class BinSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] a={10,20,30,40,50,60};
        int key=40;
        Find(a,0,5,key);
        
    }
    public static void Find (int[] a,int low,int high,int key)
    {
        int mid;
                if(low>high)
                {
                    System.out.println("Error! The element is not present in the list");
                    return;
                }
                mid = (low+high)/2;
                if(key==a[mid])
                {
                    System.out.println("The system is present at location "+(mid+1));
                    System.exit(0);
                }
                else if(key<a[mid])
                        Find(a,low,mid-1,key);
                else if(key>a[mid]);
                Find(a,mid+1,high,key);
                 
    }
}

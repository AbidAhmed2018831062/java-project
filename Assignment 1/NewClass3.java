/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author IICT (SWE)
 */

public class NewClass3 {
    public static void main(String[] args){
        NewClass b1=new NewClass(10,20);
        NewClass b2=new NewClass(20,30);
        
        
        NewClass b3= new NewClass(b1);
        
        
        b1.display();
        
        
        b3.display();
       if( b1.isequal(b2))
       {
           System.out.println("Both b1 and b2 are equal");
       }
       else
         System.out.println("Both b1 and b2 are not equal");
        
    
     if(NewClass.isTwoObjectsEqual(b1,b2))
       {
            System.out.println("Both b1 and b2 are  equal");
       }
       else
         System.out.println("Both b1 and b2 are not   equal");
         if(NewClass.isTwoObjectsEqual(b1,b3))
       {
            System.out.println("Both b1 and b3 are  equal");
       }
       else
         System.out.println("Both b1 and b3 are not  equal");
    
}
}

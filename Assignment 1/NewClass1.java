/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;


public class NewClass1 {
    static int a=0,b=1,c=0;
   public static void main(String[] args)
    {
        //System.out.println(a+" "+b);
         NewClass1 ob = new  NewClass1();
         ob.print(10);
     }
    void print(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.println(+c);
            a=b;
            b=c;
            print(i-1);
        }
    }
    }


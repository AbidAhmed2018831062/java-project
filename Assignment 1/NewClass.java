/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;


public class NewClass {
    int width;
    int height;
    NewClass(int w, int h)
    {
        width=w;
        height=h;
        
    }
    NewClass (NewClass b)
    {
        this.width= b.width;
        this.height=b.height;
    }
    boolean isequal(NewClass b)
    {
       if(this.width == b.width&&this.height==b.height)
       {
           return true;
       }
       else
           return false;
    }
    static boolean isTwoObjectsEqual(NewClass b1, NewClass b2  )
    {
        if(b1.width==b2.width&&b1.height==b2.height)
            return true;
        else
            return false;
    }
    void display()
    {
        System.out.println("Width is "+this.width+" and height is"+this.height);
    }
}


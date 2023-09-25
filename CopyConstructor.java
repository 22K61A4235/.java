//CopyConstructor.java
import java.io.*;
import java.util.*;
class Rectangle
{
    int l,b,a;
    Rectangle()
    {
        l=1;
        b=4;
        a=l*b;
    }
    Rectangle(int x,int y)
    {
        l=x;
        b=y;
        a=l*b;
    }
    Rectangle(Rectangle r)
    {
        this.l=r.l;
        this.b=r.b;
        this.a=l*b;
    }
}
    public class CopyConstructor
    {
        public static void main(String args[])
        {
            Rectangle r1=new Rectangle();
            Rectangle r2=new Rectangle(3,10);
            Rectangle r3=new Rectangle(r2);
            System.out.println("area of rectangle1 is "+r1.a);
            System.out.println("area of rectangle2 is "+r2.a);
            System.out.println("area of rectangle3 is "+r3.a);
        }
    }
    

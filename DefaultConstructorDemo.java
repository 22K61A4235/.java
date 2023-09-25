//DefaultConstructorDemo.java
import java.io.*;
import java.util.*;
class Rectangle{
    int l,b,a;
    Rectangle(){
        l=15;
        b=5;
        a=l*b;
    }
}
public class DefaultConstructorDemo{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("area of rectangle1 is " +r1.a);
        System.out.println("area of rectangle2 is " +r2.a);
    }
}
  

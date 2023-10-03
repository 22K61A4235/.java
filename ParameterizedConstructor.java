import java.io.*;
import java.util.*;
class Rectangle{
    int a;
    Rectangle(int l,int b){
       a=l*b;
    }
}
class ParameterizedConstructor{
        public static void main(String args[]){
            Rectangle r=new Rectangle(6,10);
            System.out.println("The area of rectangle: "+r.a);
        }
    }

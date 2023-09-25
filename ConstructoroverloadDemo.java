//ConstructorOverloadDemo.java
import java.io.*;
import java.util.*;
class Square{
    int S;
    Square(){
        S=5;
    }
Square(int x)
{
    S=x;
}
void area(){
    System.out.println("area of the square is"+S*S);
}
}
public class ConstructorOverloadDemo{
    public static void main(String args[]){
        Square S1=new Square();
        Square S2=new Square(8);
        S1.area();
        S2.area();
    }
}

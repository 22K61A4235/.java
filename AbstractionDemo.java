import java.io.*;
import java.util.*;
abstract class Animal{
    public abstract void animalsound();
        public void sleep(){
            System.out.println("ZZZ");
        }
    }
class Cow extends Animal{
    public void animalsound(){
        System.out.println("The cow sound maa");
    }
}
public class AbstractionDemo{
    public static void main (String args[]){
        Cow c =new Cow();
        c.animalsound();
       c.sleep(); 
        }
}

//EncapsulationDemo.java
//Student name is public and number is private
import java.io.*;
import java.util.*;
class Student{
    public String Sname;
    private String Sphone;
    public String getSphone(){
        return Sphone;
    }
    public void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
    public class EncapsulationDemo{
        public static void main(String args[]){
            Student s=new Student();
            s.Sname="Yaswanth";
            s.setSphone("9908073465");
            System.out.println("Student name is "+s.Sname);
            System.out.println("Student phone number is "+s.getSphone());
        }
    }

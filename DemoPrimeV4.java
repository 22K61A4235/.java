//DemoPrimeV4.java
//Prime numbers between two numbers
public class DemoPrimeV4{
    public static void main(String args[]){
        int j,i,n;
        int num=50,flag=0;
        System.out.println("The list of prime numbers 2 to 50 is ");
        for(i=2;i<=num;i++)
        {
            flag=0;
                for(j=2;j<=i/2;j++)
             {
            if(i%j==0)
             {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print(i+" ");
        }
        }
    }
}

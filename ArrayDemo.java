//declaration,initialization of array
public class ArrayDemo{
    public static void main(String args[]) {
        int arr[];//Declaration
        arr=new int[5];//initialization
        arr[0]=11;
        arr[1]=22;
        arr[2]=33;
        arr[3]=44;
        arr[4]=55;
        System.out.println("The array elelments are :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

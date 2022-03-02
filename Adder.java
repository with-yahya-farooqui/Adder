
import java.util.*;
class Adder 
{
    int[] array;int variable;
    Adder()
    {
        array=new int[0];
        variable=0;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        array=new int[n];
        System.out.println("Enter elements of array.");
        for(int i=0;i<n;i++) array[i]=sc.nextInt();
        System.out.println("Enter target sum.");
        variable=sc.nextInt();
    }
    int[] numsum()
    {
        for(int i =0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                if(array[i]+array[j]==variable&&i!=j) {int[] arr=new int[2];arr[0]=array[i];arr[1]=array[j];return arr;}
            }
        }
        return new int[0];
    }
}
class Main{
    public static void main(String args[])
    {
        Adder a=new Adder();
        a.getdata();
        int[] arr=a.numsum();
        if(arr.length==0){System.out.println("Null Array");return;}
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

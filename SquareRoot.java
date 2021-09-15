import java.util.Scanner;
public class SquareRoot {
    public static void main (String[] args) throws java.lang.Exception
    {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of times:");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=0,t=0;
            System.out.println("Enter a number");
            a=sc.nextInt();
            t=(int)Math.sqrt(a);
            System.out.println("Square Root:" + t);
        }
    }
}
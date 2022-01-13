import java.util.*;
class factorial
{
    public static int FindFactorial(int n)
    {
        int fact=1;
        for(int i=2;i<=N;i++)
        {
            fact*=i;
        }
         return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(FindFactorial(num));
        System.out.println("feature-a");
    }
}
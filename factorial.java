import java.util.*;//package
class factorial//class
{
    public static int FindFactorial(int n)//function to find factorial
    {
        int fact=1;
        for(int i=2;i<=N;i++)
        {
            fact*=i;
        }
         return fact;
    }
    public static void main(String args[])//main
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println(FindFactorial(num));//display output
    }
}
import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check even/odd");
        a=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
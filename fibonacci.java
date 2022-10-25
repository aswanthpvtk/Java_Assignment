import java.util.*;
public class fibonacci {

    private static int fibonacci(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if (n==2)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-2)+fibonacci(n-1);

        }
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner((System.in));
        System.out.println("Enter a number:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(fibonacci(i)+" ");
        }
    }
}

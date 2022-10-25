import java.util.*;
public class perfectSquare {
    public static void main(String[] args)
    {
        System.out.println("Enter the 1st Number");
        Scanner s=new Scanner((System.in));
        int n1=s.nextInt();
        System.out.println("Enter the 2nd number");
        Scanner sc=new Scanner((System.in));
        int n2=sc.nextInt();

        for(int i=n1;i<=n2;i++)
        {
            for(int j=1;j<=n2/2;j++)
            {
                if((j*j)==i) {
                    System.out.println(i);
                }
            }
        }

    }
}

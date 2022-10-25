import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner c=new Scanner((System.in));
        System.out.println("Enter the string:");
        String s=c.next();
        char ch[]=s.toCharArray();
        String r="";
        for(int i=ch.length-1;i>=0;i--)
        {
            r=r+ch[i];
        }
        if(r.equals(s))
        {
            System.out.println("Is a palindrome");
        }
        else
        {
            System.out.println("Is not a palindrome");
        }

    }
}

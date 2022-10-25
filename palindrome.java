import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner c=new Scanner((System.in));
        System.out.println("Enter the string:");
        String s=c.next();
        char ch[]=s.toCharArray();
        boolean isPalindrome=true;
        for(int i=0;i<=(ch.length-1)/2;i++)
        {
            if(ch[i]!=ch[ch.length-(i+1)]){
                isPalindrome = false;
                System.out.println("Not a Palindrome");
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }

    }
}

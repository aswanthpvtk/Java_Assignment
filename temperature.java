import java.util.*;
public class temperature {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter Fahrenheat temperature:");
        float fah=s.nextFloat();
        float cel=((fah-32)*5)/9;
        System.out.println("The temperature in Celsius is:"+cel);

    }
}

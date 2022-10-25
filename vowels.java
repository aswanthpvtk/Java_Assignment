import java.util.*;

public class vowels {
        static String vowel(char str)
        {
            switch(str)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return "vowel";

                default:
                    return "consonant";

            }
        }

        public static void main(String[] args){
            System.out.println("Enter a character");
            Scanner s=new Scanner(System.in);
            char ch=s.next().charAt(0);
            String ans=vowel(ch);
            System.out.println(ans.toString());
        }

}

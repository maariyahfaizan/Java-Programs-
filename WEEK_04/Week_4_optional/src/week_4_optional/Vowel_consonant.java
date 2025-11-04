
package week_4_optional;
import java.util.Scanner;

public class Vowel_consonant {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter character: ");
       char c=Character.toLowerCase(sc.next().charAt(0));
       boolean check = (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
       if (check)
            System.out.println("Vowel");
       else
            System.out.println("Consonant");
    }
    
}

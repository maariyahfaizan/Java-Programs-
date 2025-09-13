package week_7;
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine().toLowerCase();
        String rev="";
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            rev=c+rev;
        }
        if (s.equals(rev)){
            System.out.println("Plaindrome");
        } else{
            System.out.println("Not a Plaindrome");
        }
    }  
}

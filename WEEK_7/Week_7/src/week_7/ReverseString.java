package week_7;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        String rev="";
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            rev=c+rev;
        }
        System.out.println(rev);
    }
}

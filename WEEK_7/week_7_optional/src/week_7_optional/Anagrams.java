package week_7_optional;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine().toLowerCase();
        System.out.println("Enter Second string: ");
        String s2=sc.nextLine().toLowerCase();
        int[] count=new int[256];
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if(s1.length()!=s2.length()){
            System.out.println("Not anagrams");
            return;
        }
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)]--;
        }
        for(int i:count){
            if (i!=0){
                System.out.println("Not anagrams");
                return;
            }
        }
        
        System.out.println("Strings are anagrams");
    }
}

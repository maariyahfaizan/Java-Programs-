package week_6_optional;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine().toLowerCase();
        boolean[] visited= new boolean[str.length()];
        
        System.out.println("Character       Frequency");
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            
            if(!Character.isLetterOrDigit(ch) || visited[i]){
                continue;
            }
            
            int count=1;
            for(int j=i+1;j<str.length();j++){
            if(str.charAt(j)==ch){
                count++;
                visited[j]=true;
            }
        }
            System.out.println("  " + ch + "                " + count);
        }
    } 
}

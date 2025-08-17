package week_5_optional;
import java.util.Scanner;


public class Hexadecimal {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Decimal number to convert to hexadecimal: ");
        int n=sc.nextInt();
        String hexa_n="";
        while(n>0){
            int r=n%16;
            n=n/16;
            if(r<10){
                hexa_n=r+hexa_n;
            }
            else{
                char c=(char)(65+r%10);
                hexa_n=c+hexa_n;
            }
        }
        System.out.println("Hexadecimal = " + hexa_n);
        
        System.out.println("Enter hexadecimal number to convert to decimal: ");
        String hex=sc.next();
        int decimal=0;
        int base=1;
        for(int i=hex.length()-1;i>=0;i--){
            char ch=hex.charAt(i);
            int value;
            if(ch>='0' && ch<='9'){
                value=ch-'0';
            }
            else if(ch>='A' && ch<='F'){
                value= ch-'A' + 10;
            }
            else{
                System.out.println("Invalid hexadecimal character " + ch);
                return;
            }
            decimal+=value*base;
            base*=16;
        }
        System.out.println("Decimal = " + decimal);
        
    }
    
}

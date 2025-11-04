package ques9;

public class MathOp {
    static int findGCD(int a, int b){
        int r=a%b;
        while(r>0){
            a=b;
            b=r;
            r=a%b;
        }
        
        return b;
    }
    
    
    static int findLCM(int a,int b){
        int gcd=findGCD(a,b);
        return (a*b)/gcd;
    }
}

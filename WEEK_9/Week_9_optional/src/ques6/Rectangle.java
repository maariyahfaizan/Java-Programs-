package ques6;

public class Rectangle extends Shape {
    double length;
    double breadth;
    
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    
    @Override
    void area(){
        System.out.println("Area = " + length*breadth);
}
}

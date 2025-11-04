package ques6;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    void area(){
        System.out.println("Area = " + Math.PI*radius*radius);
    }
}

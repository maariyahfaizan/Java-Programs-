package ques2;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of fruit and packaging: ");
        Edible.Fruit f1= new Edible.Fruit(sc.nextLine(),sc.nextLine());
        f1.fruitDetails();
        f1.fruitPackaging();
        System.out.println("Enter name of Vegetable and packaging: ");
        Edible.Vegetable v1= new Edible.Vegetable(sc.nextLine(),sc.nextLine());
        v1.vegetableDetails();
        v1.vegetablePackaging();
        
        
    }
    
}

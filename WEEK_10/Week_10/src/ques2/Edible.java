package ques2;

public class Edible {
    static class Fruit {
        static String fruit;
        String packaging;
        static void fruitDetails(){
            System.out.println("Name of fruit = " + fruit);
        }
        
        void fruitPackaging(){
            System.out.println("Packaging of fruit = " + packaging);
        }

        public Fruit(String fruit, String packaging) {
            this.fruit = fruit;
            this.packaging = packaging;
        }
        
    }
    
    static class Vegetable {
        String vegetable;
        String packaging;
        void vegetableDetails(){
            System.out.println("Name of vegetable = " + vegetable);
        }
        
        void vegetablePackaging(){
            System.out.println("Packaging of vegetable = " + packaging);
        }

        public Vegetable(String vegetable, String packaging) {
            this.vegetable = vegetable;
            this.packaging = packaging;
        }
        
    }
}

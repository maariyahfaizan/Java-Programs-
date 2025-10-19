package ques3;

public interface Scooty {
    void offer();
    default void details(){
        System.out.println("Details of Scooty");
    }
}

package ques2;

public class University {
   private String universityName; 
   private int ranking;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
   

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    void details(){
        System.out.println("Name of university = " + universityName);
        System.out.println("Ranking = " + ranking);
    } 
}

package ques2;

public class Department extends Faculty{
   private String name;
   private String chairperson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChairperson() {
        return chairperson;
    }

    public void setChairperson(String chairperson) {
        this.chairperson = chairperson;
    }
   
   void details(){
       System.out.println("Name of Department = " + name);
       System.out.println("Chairperson = " + chairperson);
   }
   
   void display(){
       super.details();
       details();
   }
}

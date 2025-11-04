package ques2;

public class Faculty extends University{
    private String facultyName;
    
    public void setFacultyName(String name){
        this.facultyName=name;
    }
    
    public String getFacultyName(){
        return facultyName;
    }
    
    void details(){
        super.details();
        System.out.println("Name of Faculty = " + facultyName);
    }
}

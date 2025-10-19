package ques6;

public class Faculty extends University{
    private String facultyName;
    
    public void setFacultyName(String name){
        this.facultyName=name;
    }
    
    public String getFacultyName(){
        return facultyName;
    }
    
    Faculty(String universityname,int ranking,String facultyname){
        super(universityname,ranking);
        this.facultyName=facultyname;
    }
    
    void details(){
        super.details();
        System.out.println("Name of Faculty = " + facultyName);
    }   
}

public abstract class Student {
    int StudentID;
    String StudentLastName;
    int AnnualTution;
    public Student(int StudentID,String StudentLastName){
        this.StudentID=StudentID;
        this.StudentLastName=StudentLastName;
    }
    public int getStudentID(){
        return StudentID;
    }
    public String getStudentLastName(){
        return StudentLastName;
    }
    public int getAnnualTution(){
        return AnnualTution;
    }
    public void setStudentID(){}
    public void setStudentLastName(){}
    public abstract void setAnnualTution();
}

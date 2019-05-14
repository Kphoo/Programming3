public class GraduateStudent extends Student {
    public GraduateStudent(int StudentID, String StudentLastName){
        super(StudentID,StudentLastName);
    }

    @Override
    public void setAnnualTution() {
        AnnualTution=6000;
    }
}

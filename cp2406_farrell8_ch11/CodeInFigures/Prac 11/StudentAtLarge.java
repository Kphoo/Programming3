public class StudentAtLarge extends Student {
    public StudentAtLarge(int StudentID, String StudentLastName){
        super(StudentID,StudentLastName);
    }

    @Override
    public void setAnnualTution() {
        AnnualTution=2000;
    }
}
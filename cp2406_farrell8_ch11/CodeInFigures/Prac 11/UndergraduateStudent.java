public class UndergraduateStudent extends Student {
    public UndergraduateStudent(int StudentID, String StudentLastName) {
        super(StudentID, StudentLastName);

    }

    @Override
    public void setAnnualTution() {
        AnnualTution=4000 ;
    }
}

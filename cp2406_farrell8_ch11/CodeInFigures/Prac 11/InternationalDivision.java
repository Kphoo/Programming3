public class InternationalDivision extends Division{
    String DivisionLocation;
    String Language;
    public InternationalDivision(String DivisionName, int AccountNumber, String DivisionLocation, String Language){
        super(DivisionName,AccountNumber);
        this.DivisionLocation= DivisionLocation;
        this.Language=Language;
    }

    @Override
    public String display() {
        return AccountNumber + " Is in " + DivisionName + " , "+ DivisionLocation +" and they use "+ Language;
    }
}

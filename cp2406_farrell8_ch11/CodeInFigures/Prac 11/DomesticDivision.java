public class DomesticDivision extends Division {
    String DivisionState;

    public DomesticDivision(String DivisionName,int AccountNumber,String DivisionState){
        super(DivisionName,AccountNumber);
        this.DivisionState=DivisionState;
    }
    @Override
    public String display(){
    return AccountNumber + " Is in " + DivisionName + " , "+ DivisionState ;
    }
}

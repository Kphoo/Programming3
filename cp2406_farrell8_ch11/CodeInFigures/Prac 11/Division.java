public abstract class Division {
    String DivisionName;
    int AccountNumber;

    public Division(String DivisionName, int AccountNumber){
        this.DivisionName=DivisionName;
        this.AccountNumber=AccountNumber;
    }
    public abstract String display();
}

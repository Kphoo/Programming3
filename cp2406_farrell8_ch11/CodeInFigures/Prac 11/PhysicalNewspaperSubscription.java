public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String inputaddress){
        if(inputaddress==null){
            System.out.println("Error, you did not input address");
            rate=0;
        }
        else {
            address=inputaddress;
            rate=15;
        }
    }
}

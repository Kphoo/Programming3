public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String inputAddress){
        if(inputAddress.indexOf('@') == -1){
            System.out.println("Error, please contain @ sign ");
            rate=0;
        }
        else {
            address = inputAddress;
            rate= 9;
        }
    }
}

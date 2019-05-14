import java.util.SplittableRandom;

public abstract class NewspaperSubscription {
    String subscriberName;
    String address;
    int rate;


        public String getSubscriberName() {
        return subscriberName;
    }

        public void setSubscriberName (String subscriberName){
        this.subscriberName = subscriberName;
    }
        public String getAddress() {
        return address;
    }
        public int getRate() {
        return rate;
    }
        public abstract void setAddress(String inputaddress);

}



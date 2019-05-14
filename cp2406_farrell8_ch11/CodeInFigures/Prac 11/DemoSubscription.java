public class DemoSubscription {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription Physicaladdress= new PhysicalNewspaperSubscription ();
        OnlineNewspaperSubscription Onlineaddress= new OnlineNewspaperSubscription();
        String asdf = null;
        Physicaladdress.setAddress(asdf);
        Onlineaddress.setAddress("KK@gmail.com");
        System.out.println(Physicaladdress.getAddress());
        System.out.println(Physicaladdress.getRate());
        System.out.println(Onlineaddress.getAddress());
        System.out.println(Onlineaddress.getRate());
    }
}

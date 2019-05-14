public class UseBook {
    public static void main(String[] args) {
        Fiction myFiction = new Fiction("hihi");
        NonFiction myNonFiction = new NonFiction("gigi");
        System.out.println(myFiction.getBookTitle() + " costs " + myFiction.getPrice());
        System.out.println(myNonFiction.getBookTitle()+ " costs " + myNonFiction.getPrice());
    }
}

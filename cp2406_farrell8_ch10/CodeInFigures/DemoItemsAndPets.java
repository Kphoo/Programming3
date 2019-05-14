public class DemoItemsAndPets {
    public static void main(String[] args) {


        PetSold one = new PetSold();
        ItemSold two = new ItemSold();
        one.setInvoice(1);
        one.setDescription("total bill");
        one.setPrice(32);
        System.out.println("The invoice number " + one.invoice +"of the " + one.description+"is "+one.price);
    }
}
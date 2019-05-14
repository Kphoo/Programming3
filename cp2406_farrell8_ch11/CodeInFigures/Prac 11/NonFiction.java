public class NonFiction extends Book {

    public NonFiction(String BookTile){
        super(BookTile);
        this.Price=Price;
        setPrice();
    }

    @Override
    public void setPrice() {
        Price=37.99;
    }
}

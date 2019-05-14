public class Fiction extends Book {

    public Fiction(String BookTitle){
        super(BookTitle);
        this.Price= Price;
        setPrice();
    }
    @Override
    public void setPrice(){
        Price=24.99;

    }
}

public abstract class Book{
    String BookTitle;
    double Price;

    public Book (String BookTitle){
        this.BookTitle= BookTitle;
    }

    public String getBookTitle(){
        return BookTitle;
    }
    public double getPrice(){
        return Price;
    }

    public abstract void setPrice();
}
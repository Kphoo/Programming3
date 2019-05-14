public class BookArray {
    public static void main(String[] args) {
        String[] Booklist= {"gigi","hihi","koko","aasas","ieire","uuu", "jiji" , "abc", "nunu","uuuu"};
        for (int i =0;i<Booklist.length;i++){
            Fiction FicBook= new Fiction(Booklist[i]);
            System.out.println("Fiction"+ FicBook.getBookTitle()+ "costs"+ FicBook.getPrice());
            NonFiction NonFicBook= new NonFiction(Booklist[i]);
            System.out.println("NonFiction"+ NonFicBook.getBookTitle()+ "costs"+NonFicBook.getPrice());
        }
    }
}

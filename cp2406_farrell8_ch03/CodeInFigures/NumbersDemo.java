public class NumbersDemo
{
    public static void main(String args[]) {
        int a = 5 ;
        int b  = 6 ;
        displayTwiceThenumber(a, b);
        displayNumberplusFive (a,b);
        displayNumberSquared(a,b);
    }

    public static void displayTwiceThenumber(int a, int b)
    {
        System.out.println("The Twice Number " +"is"+ (a*2)+","+(b*2) );
    }

    public static void displayNumberplusFive(int a, int b)
    {
        System.out.println("The Number Plus Five" + "is"+(a+5)+","+(b+5) );
    }

    public static void displayNumberSquared(int a, int b)
    {
        System.out.println("The Number Squared" + "is"+ (a*a)+","+ Math.pow(b,2) );
    }
}

import java.util.Scanner;

public class NumbersDemo2
{
    public static void main(String args[])
    {
        int number1,number2;
        number1=getnumber();
        number2=getnumber();
        System.out.println("Square of "+ number1 +"and" +number2 +" is: "+ (number1*2) +"and "+ (number2*2));
        System.out.println("Number Plus Five of "+ number1 +"and" +number2 +" is: "+ (number1+5) + "and" + (number2+5));
        System.out.println("Squared of "+ number1 +"and" +number2 + " is: "+ Math.pow(number1,2) + "and" + Math.pow(number2,2));

    }
    public static int getnumber()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number" );
        number = input.nextInt();
        return number;
    }

}

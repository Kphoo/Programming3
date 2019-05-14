import java.util.*;
public class FormLetterWritter
{
    public static void main(String[] args) {

        Scanner takeName = new Scanner(System.in);
        System.out.println("Enter your last name.");
        String lName = takeName.next();
        displaySalutation(lName);
        System.out.println("Please enter your first name. ");
        String fName = takeName.next();
        displaySalutation(fName, lName);
        System.out.println(lName);
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String lName){
        System.out.println("Dear Mr or Mrs. " + lName);
    }

    public static void displaySalutation(String fName,String lastName){
        System.out.println("Dear" + fName + " " + lastName);

    }
}


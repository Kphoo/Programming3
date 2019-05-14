import java.util.*;

public class Factorials{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you would like to factorial.");
        int trythis = 1;
        int fact = sc.nextInt();
        int i=1;
        System.out.print("The factorial of " + fact + " is  ");
        while(i<=fact){
            trythis = trythis*i;
            i++;
            System.out.print(i-1 + " * ");

        }
        System.out.println("= " + trythis);

    }
}
import java.util.*;
public class EvenEntryLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an even number or 999");
        int num = 999;
        int even = sc.nextInt();
        evenLoop(even, num);
    }

    public static void evenLoop(int even, int num){
        if (even % 2 == 0) {
            System.out.println("Good Job");
        } else if (even == num) {
            System.exit(0);

        } else {
            System.out.println("This is an error");
            Scanner sc = new Scanner(System.in);
            even = sc.nextInt();
            evenLoop(even, num);
        }



    }
}

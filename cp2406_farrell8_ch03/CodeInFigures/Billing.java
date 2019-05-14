import java.util.Scanner;

public class Billing
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Price ");
        int returnPrice=input.nextInt();
        System.out.println(computeBill(returnPrice));
        Scanner order=new Scanner(System.in);
        System.out.println("Enter Quantity Order ");
        int quantity=order.nextInt();
        System.out.println(computeBill(returnPrice, quantity));
        Scanner coupon=new Scanner(System.in);
        System.out.println("Enter Coupon Value ");
        int coupon_value=coupon.nextInt();
        System.out.println(computeBill(returnPrice,quantity,coupon_value));

    }
    public static double computeBill(int returnPrice){

      double total=(returnPrice + (returnPrice*0.08));
      return total;
    }
    public static double computeBill(int returnPrice,int quantity){

        double total= ((quantity*returnPrice) +(quantity*returnPrice)*0.08);
        return total;
    }
    public static double computeBill(int returnPrice,int quantity,int coupon_value){
        double total = (((quantity*returnPrice)-coupon_value) +((quantity*returnPrice)-coupon_value)*0.08);
        return total;
    }
}

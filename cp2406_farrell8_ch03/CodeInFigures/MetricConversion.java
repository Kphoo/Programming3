import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        double value;
        value=getvalue();
        get_centimeter_value(value);
        get_liters_value(value);
    }
    public static int getvalue(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Value ");
        int value=input.nextInt();
        return value;
    }
    public static void get_centimeter_value(double value)
    {
        System.out.println("Converting "+ value + "from Inches to centimeter is "+ (value*2.54));
    }
    public static void get_liters_value(double value)
    {
        System.out.println("Converting "+ value + "from Gallons to liters is "+ (value*3.78));
    }
}

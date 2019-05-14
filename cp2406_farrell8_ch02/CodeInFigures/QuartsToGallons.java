public class QuartsToGallons
{
    public static void main(String arg[])
    {
        int Quarts_in_gallons=4;
        int Quarts=18;
        System.out.println("A Job that needs 18 quarts requires " +(Quarts/Quarts_in_gallons) +
                "gallons plus " + (Quarts%Quarts_in_gallons)+"quarts");
    }
}

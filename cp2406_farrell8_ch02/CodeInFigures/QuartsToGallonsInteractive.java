import javax.swing.*;
public class QuartsToGallonsInteractive
{
    public static void main(String[]args)
    {
        String quartsString;
        int Quarts_in_gallons=4;
        quartsString= JOptionPane.showInputDialog(null,"Enter the number of quarts needed for the job","Quarts to Gallon",
                JOptionPane.INFORMATION_MESSAGE);
        int Quarts=Integer.parseInt(quartsString);
        JOptionPane.showMessageDialog(null,"A job that needs " + Quarts +"requires "+(Quarts/Quarts_in_gallons)+ "gallons plus " +(Quarts/Quarts_in_gallons)+ " quarts");

    }
}

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
public class InchesToFeetInteractive
{
    public static void main(String args[])
    {
        String inchesString;
        int Inches_in_feet=12;
        inchesString= JOptionPane.showInputDialog(null,"Enter inches","Inches To feet",
                JOptionPane.INFORMATION_MESSAGE);
        int inches=Integer.parseInt(inchesString);
        JOptionPane.showMessageDialog(null,(inches/Inches_in_feet)+ "feet" +(inches%Inches_in_feet)+ "inches");
    }
}


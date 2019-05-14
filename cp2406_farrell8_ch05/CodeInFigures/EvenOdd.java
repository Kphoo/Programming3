import javax.swing.*;
public class EvenOdd
{
    public static void main(String[] args) {
        int num;
        String str ,output;
        str = JOptionPane.showInputDialog(null,"Enter an integer");
        num = Integer.parseInt(str);
        if(num %2==0)
            output = "The integer is Even " ;
        else
            output="The integer is Odd" ;
        JOptionPane.showMessageDialog(null, output);
    }
}
